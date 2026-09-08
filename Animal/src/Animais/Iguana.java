package Animais;

public class Iguana extends Reptil{
    public Iguana(String nome, String familia, String sexo, String cor, String habitat, int idade){
        super(nome, familia, sexo, cor, habitat, idade);
    }

    public void sibilo(){
        System.out.printf("%s sibila\n", getNome());
    }

    public void escalar(){
        System.out.printf("%s escalou\n", getNome());
    }
}