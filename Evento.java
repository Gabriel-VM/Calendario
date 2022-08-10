import java.util.ArrayList;

public class Evento extends Tarefa {

    private String local;
    private Data data;
    private boolean aviso;
    private int antecedencia;
    private ArrayList<Contatos> contatos = new ArrayList<Contatos>();

    public Evento(String nome, String descr, String local, Data data, boolean aviso, int antecedencia) {
        super(nome,descr);
        this.local = local;
        this.data = data;
        this.aviso = aviso;
        this.antecedencia = antecedencia;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isAviso() {
        return aviso;
    }

    public void setAviso(boolean aviso) {
        this.aviso = aviso;
    }

    public int getAntecedencia() {
        return antecedencia;
    }

    public void setAntecedencia(int antecedencia) {
        this.antecedencia = antecedencia;
    }

    @Override
    public ArrayList<Contatos> getContatos() {
        return contatos;
    }

    public void adcContato(Contatos contato){
        getContatos().add(contato);
    }
}
