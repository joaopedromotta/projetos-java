package Animais;

public class Cachorro extends Mamifero{
    public Cachorro(String nome, String familia, String sexo, String cor, String habitat, int idade){
        super(nome, familia, sexo, cor, habitat, idade);
    }

    public void latir(){
        System.out.printf("%s latiu\n", getNome());
    }

    public void sacudir(){
        System.out.printf("%s sacudiu\n", getNome());
    }
}
