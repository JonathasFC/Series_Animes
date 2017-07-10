package a1.a2017.iff.seriesanimes.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.*;

import java.util.List;

import a1.a2017.iff.seriesanimes.Activity.Series;
import a1.a2017.iff.seriesanimes.Model.Serie;
import a1.a2017.iff.seriesanimes.R;


/**
 * Created by jonat on 09/07/2017.
 */

public class SerieAdapter extends RecyclerView.Adapter{
    private List<Serie> series;
    private Context context;
    private static ClickRecyclerViewListener clickRecyclerViewListener;

    public SerieAdapter(List<Serie> series, Context context, ClickRecyclerViewListener clickRecyclerViewListener) {
        this.series = series;
        this.context = context;
        SerieAdapter.clickRecyclerViewListener = clickRecyclerViewListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_lista_series, parent, false);
        SerieViewHolder serieViewHolder = new SerieViewHolder(view);
        return serieViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SerieViewHolder holder_series = (SerieViewHolder) viewHolder;

        Serie serie = series.get(position);

        holder_series.tituloSerie.setText(serie.getTitulo());
        holder_series.ano_lancamentoSerie.setText(serie.getAno_lancamento());
        holder_series.descricaoSerie.setText(serie.getDescricao());
        holder_series.tipoSerie.setText(serie.getTipo());
        Log.i("------XXXXXXXXX------", serie.getDescricao());
    }

    @Override
    public int getItemCount() {
        return series.size();
    }

    public class SerieViewHolder extends RecyclerView.ViewHolder {

        private final TextView tituloSerie;
        private final TextView ano_lancamentoSerie;
        private final TextView descricaoSerie;
        private final TextView tipoSerie;


        public SerieViewHolder(View itemView) {
            super(itemView);
            tituloSerie = (TextView) itemView.findViewById(R.id.tv_titulo);
            ano_lancamentoSerie = (TextView) itemView.findViewById(R.id.tv_ano_lancamento);
            descricaoSerie = (TextView) itemView.findViewById(R.id.tv_descricao);
            tipoSerie = (TextView) itemView.findViewById(R.id.tv_tipo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewListener.onClick(series.get(getLayoutPosition()));

                }
            });

        }
    }
}
