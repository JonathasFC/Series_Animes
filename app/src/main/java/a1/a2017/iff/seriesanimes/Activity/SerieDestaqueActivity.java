package a1.a2017.iff.seriesanimes.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import a1.a2017.iff.seriesanimes.Model.Serie;
import a1.a2017.iff.seriesanimes.R;

public class SerieDestaqueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serie_destaque);
        Intent intent = getIntent();
        Serie serie = (Serie) intent.getSerializableExtra("serie");
        EditText titulo = (EditText) findViewById(R.id.et_titulo_serie_destaque);
        EditText descricao = (EditText) findViewById(R.id.et_descricao_serie_destaque);
        EditText ano_lancamento = (EditText) findViewById(R.id.et_ano_lancamento_serie_destaque);
        EditText tipo = (EditText) findViewById(R.id.et_tipo_serie_destaque);

        titulo.setText(serie.getTitulo());
        descricao.setText(serie.getDescricao());
        ano_lancamento.setText(serie.getAno_lancamento());
        tipo.setText(serie.getTipo());


    }
}
