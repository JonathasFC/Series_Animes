package a1.a2017.iff.seriesanimes.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import a1.a2017.iff.seriesanimes.Adapter.SerieAdapter;
import a1.a2017.iff.seriesanimes.Model.Serie;
import a1.a2017.iff.seriesanimes.R;

public class Series extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_series);

        recyclerView.setAdapter(new SerieAdapter(getSeries(),this,this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

    }
    private List<Serie> getSeries(){
        List<Serie> series = new ArrayList<Serie>();
        int i =0;
        for(i=0;i<=20;i++){
            String iv = String.valueOf(i);
            Serie serie = new Serie("Série".concat(iv),"Descrição".concat(iv),"Ano de Lançamento".concat(iv),"Tipo da Série".concat(iv));
            series.add(serie);
        }
        return series;

    }
}
//EU PAREI AQUI! tENHO QUE CONFIGURAR ESSA CLASSE AINDA. VER A CLASSE LIVROACTIVITY