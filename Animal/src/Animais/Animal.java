package Animais;

public class Animal {

    private String nome;
    private String familia;
    private String cor;
    private String raca;
    private String sexo;
    private int idade;

    public Animal(String nome, String Familia, String cor, String raca, String sexo, int idade) {
        this.nome = nome;
        this.familia = Familia;
        this.cor = cor;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String Familia) {
        this.familia = Familia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void lamber(String nome){
        System.out.println(nome + "está lambendo.");
    }

    public void correr(String nome) {
        System.out.println(nome + " está correndo.");
    }

    public void dormir(String nome) {
        System.out.println(nome + " está dormindo.");
    }

    public void brincar(String nome) {
        System.out.println(nome + " está brincando.");
    }

    public void comer(String nome) {
        System.out.println(nome + " está comendo.");
    }

    public void beber(String nome) {
        System.out.println(nome + " está bebendo.");
    }

    public void emitirSom(String nome) {
        System.out.println(nome + " está emitindo som.");
    }

    public void botarOvo(String nome){
        System.out.println(nome + " botou um ovo");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", familia='" + familia + '\'' +
                ", cor='" + cor + '\'' +
                ", raca='" + raca + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
