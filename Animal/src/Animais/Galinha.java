package Animais;

public class Galinha extends Ave{
    public Galinha(String nome, String familia, String sexo, String cor, String habitat, int idade){
        super(nome, familia, sexo, cor, habitat, idade);
    }

    public void emitirSom(){
        System.out.printf("%s cacarejou\n", getNome());
    }
    
}
