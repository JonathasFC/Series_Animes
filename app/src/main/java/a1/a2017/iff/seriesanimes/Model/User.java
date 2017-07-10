package a1.a2017.iff.seriesanimes.Model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by jonat on 10/07/2017.
 */

public class User implements Serializable{
    private String nome;
    private String email;
    private Date datanasc;

    public User(String nome, String email, Date datanasc){
        this.nome = nome;
        this.email = email;
        this.datanasc = datanasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(Date datanasc) {
        this.datanasc = datanasc;
    }
}
