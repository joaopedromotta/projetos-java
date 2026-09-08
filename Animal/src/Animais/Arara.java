package Animais;

public class Arara extends Ave{
    public Arara(String nome, String familia, String sexo, String cor, String habitat, int idade){
        super(nome, familia, sexo, cor, habitat, idade);
    }

    public void gritar(){
        System.out.printf("%s gritou\n", getNome());
    }

    public void falar(){
        System.out.printf("%s falou\n", getNome());
    }
    
}
