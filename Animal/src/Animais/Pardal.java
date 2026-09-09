package Animais;

public class Pardal extends Ave {
    public Pardal(String nome, String familia, String sexo, String cor, String habitat, int idade){
        super(nome, familia, sexo, cor, habitat, idade);
    }

    public void emitirSom(){
        System.out.printf("%s piou\n", getNome());
    }
}
