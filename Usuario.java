import java.util.ArrayList;

public class Usuario {

    private String nome;
    private String senha;
    private String email;
    private String tel;
    private String endereco;
    private String tipo; // Admin, usuário ou convidado.

    public Usuario(String nome, String senha, String email, String tel, String endereço, String tipo) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.tel = tel;
        this.endereco = endereço;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public void criarEvento(String nome, String descr, ArrayList<Contatos> contatosVinculados, String local, Data data, boolean aviso, int antecedencia){
        Evento evento = new Evento(nome, descr, local, data, aviso, antecedencia);
    }

    public void criarTarefa(String nome, String descr){
        Tarefa tarefa = new Tarefa(nome, descr);
    }



}
