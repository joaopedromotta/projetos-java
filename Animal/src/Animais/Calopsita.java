package Animais;

public class Calopsita extends Ave{
    public Calopsita(String nome, String familia, String sexo, String cor, String habitat, int idade){
        super(nome, familia, sexo, cor, habitat, idade);
    }

    public void cantar(){
        System.out.printf("%s canta\n", getNome());
    }

}
