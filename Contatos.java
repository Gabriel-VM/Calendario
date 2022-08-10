public class Contatos {

    private String nome;
    private String sobrenome;
    private String email;
    private String tel;

    public Contatos(String nome, String sobrenome, String email, String tel) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.tel = tel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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
}
