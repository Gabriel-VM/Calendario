import java.util.ArrayList;

public class Tarefa {

    private String nome;
    private String descr;
    private ArrayList<Contatos> contatos = new ArrayList<Contatos>();

    public Tarefa(String nome, String descr) {
        this.nome = nome;
        this.descr = descr;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public ArrayList<Contatos> getContatos() {
        return contatos;
    }

    public void adcContato(Contatos contato){
        getContatos().add(contato);
    }
}
