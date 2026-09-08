package Animais;

public class Reptil extends Animal {
    public Reptil(String nome, String familia, String cor, String raca, String sexo, int idade) {
        super(nome, familia, cor, raca, sexo, idade);
    }

    public void rastejar(String nome) {
        System.out.println(nome + " está rastejando.");
    }
}
