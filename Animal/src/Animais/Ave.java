package Animais;

public class Ave extends Animal {
    public Ave(String nome, String familia, String cor, String raca, String sexo, int idade) {
        super(nome, familia, cor, raca, sexo, idade);
    }   

    public void voar() {
        System.out.println(getNome() + " está voando.");
    }

}
