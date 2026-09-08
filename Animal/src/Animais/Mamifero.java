package Animais;

public class Mamifero extends Animal {
    public Mamifero(String nome, String familia, String cor, String raca, String sexo, int idade) {
        super(nome, familia, cor, raca, sexo, idade);
    }

    public void amamentar(String nome) {
        System.out.println(nome + " está amamentando.");
    }
}