package edm.senacrs.com.br.projetocrudcontato;

import java.io.Serializable;

/**
 * Created by gaspar on 09/05/16.
 */
public class Contato implements Serializable {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
