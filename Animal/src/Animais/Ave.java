package Animais;

public class Ave extends Animal {
    public Ave(String nome, String familia, String cor, String raca, String sexo, int idade) {
        super(nome, familia, cor, raca, sexo, idade);
    }   

    public void voar(String nome) {
        System.out.println(nome + " está voando.");
    }

}
