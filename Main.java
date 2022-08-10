public class Main {

    public static void main(String[] args) {

        Usuario joao = new Usuario("João","12345","joao_joao@gmail.com","999-455-744","Rua da Paz, 75", "Admin");
        Contatos amigoJoao = new Contatos("Fulano", "Das Couves", "dascouves@gmail.com", "2345678");
        Tarefa tarefa = new Tarefa("Lavar o carro", "Lavar o carro junto com o fulano");
        tarefa.adcContato(amigoJoao);
        tarefa.adcContato(new Contatos("Beltrano","De tal","baltrano@gmail.com", "9999999"));
        System.out.println(tarefa.getContatos());

        joao.criarEvento("Aniversario","Aniversario no Bar",null,"Bar do centro",new Data(02, 06, 2022),true,4);
        joao.criarTarefa("Concluir tema Tokio","Terminar o módulo de programaçao em Java");

        Evento jantar = new Evento("Jantar na casa do Fulano","Janta de comemoração do novo emprego","Casa do Fulano", new Data(12, 7, 2022),true,2);
        jantar.adcContato(amigoJoao);
        System.out.println(jantar.getContatos());

    }
}
