package a1.a2017.iff.seriesanimes.Model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by jonat on 09/07/2017.
 */

public class Serie implements Serializable {

    private String titulo;
    private String descricao;
    private String ano_lancamento;
    private String tipo; //Exemplo: drama, terror, comédia, ficção cientifica, etc.
//    List elenco = Collections.synchronizedList(new ArrayList());

    public Serie(String titulo, String descricao, String ano_lancamento, String tipo){//Adiconar Elenco (List)
        this.titulo = titulo;
        this.descricao = descricao;
        this.ano_lancamento = ano_lancamento;
        this.tipo = tipo;
//        this.elenco = elenco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAno_lancamento() {
        return ano_lancamento;
    }

    public void setAno_lancamento(String ano_lancamento) {
        this.ano_lancamento = ano_lancamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

//    public List getElenco() {
//        return elenco;
//    }
//
//    public void setElenco(List elenco) {
//        this.elenco = elenco;
//    }

}
