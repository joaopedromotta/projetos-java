package Animais;

public class Cachorro extends Mamifero{
    public Cachorro(String nome, String familia, String sexo, String cor, String habitat, int idade){
        super(nome, familia, sexo, cor, habitat, idade);
    }

    public void sacudir(){
        System.out.printf("%s sacudiu\n", getNome());
    }

    public void emitirSom(){
        System.out.printf("%s latiu\n", getNome());
    }
}
