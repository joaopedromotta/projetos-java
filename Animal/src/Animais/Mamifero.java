package Animais;

abstract class Mamifero extends Animal {
    public Mamifero(String nome, String familia, String cor, String raca, String sexo, int idade) {
        super(nome, familia, cor, raca, sexo, idade);
    }

    public void amamentar() {
        System.out.println(getNome() + " está amamentando.");
    }

    public void lamber(){
        System.out.println(getNome() + "está lambendo.");
    }

    @Override
     public abstract void emitirSom();
}