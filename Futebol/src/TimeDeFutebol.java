import java.util.ArrayList;

public class TimeDeFutebol {
    private String nome;
    private String cidade;
    private int anoFundacao;

    private ArrayList<Jogador> jogadores;
    private ArrayList<Premiacao> premiacoes;


    public TimeDeFutebol(String nome, String cidade, int anoFundacao) {
        this.nome = nome;
        this.cidade = cidade;
        this.anoFundacao = anoFundacao;

        this.jogadores = new ArrayList<>();
        this.premiacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void adicionarPremiacao(Premiacao premiacao) {
        premiacoes.add(premiacao);
    }

    public void mostrarTime() {
        System.out.println("Nome: " + nome);
        System.out.println("Cidade: " + cidade);
        System.out.println("Ano de Fundação: " + anoFundacao);
        System.out.println("Jogadores:");
        for (Jogador jogador : jogadores) {
            System.out.println(" - " + jogador.getNome() + " (" + jogador.getPosicao() + ")");
        }
        System.out.println("Premiações:");
        for (Premiacao premiacao : premiacoes) {
            System.out.println(" - " + premiacao.getNome() + " (" + premiacao.getAno() + ")");
        }
    }
}
