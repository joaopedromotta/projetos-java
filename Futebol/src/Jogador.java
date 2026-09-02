public class Jogador {
    private String nome;
    private int idade;
    private String posicao;
    private int numeroCamisa;

    public Jogador(String nome, int idade, String posicao, int numeroCamisa) {
        this.nome = nome;
        this.idade = idade;
        this.posicao = posicao;
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getPosicao() {
        return posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public void mostrarJogador() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Posição: " + posicao);
        System.out.println("Número da Camisa: " + numeroCamisa);
    }
}
