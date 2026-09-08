package Animais;

public class Gato extends Mamifero{
    public Gato(String nome, String familia, String raca, String cor, String sexo, int idade){
        super(nome, familia, raca, cor, sexo, idade);
    }

    public void miar(){
        System.out.printf("%s miou\n", getNome());
    }
    
    public void roronar(){
        System.out.printf("%s roronou\n", getNome());
    }

}
