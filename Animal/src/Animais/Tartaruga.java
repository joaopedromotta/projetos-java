package Animais;

public class Tartaruga extends Reptil{
    public Tartaruga(String nome, String familia, String sexo, String cor, String habitat, int idade){
        super(nome, familia, sexo, cor, habitat, idade);
    }

    public void nadar(){
        System.out.printf("%s nadou\n", getNome());
    }

    public void Esconder(){
        System.out.printf("%s se escondeu no casco\n", getNome());
    }
    
    public void emitirSom(){
        System.out.printf("%s Não emite som\n", getNome());
    }


}
