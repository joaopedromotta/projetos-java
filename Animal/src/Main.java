
import Animais.Arara;
import Animais.Cachorro;
import Animais.Calopsita;
import Animais.Galinha;
import Animais.Gato;
import Animais.Iguana;
import Animais.Pardal;
import Animais.Tartaruga;

public class Main {

    public static void main(String[] args) {

        //Instanciando os objetos de cada classe
        Cachorro cachorro1 = new Cachorro("Rex", "Canidae", "Macho", "Marrom", "Doméstico", 5);
        Gato gato1 = new Gato("Mingau", "Felidae", "Fêmea", "Cinza", "Doméstico", 3);
        Arara arara1 = new Arara("Loro", "Psittacidae", "Macho", "Azul e Amarelo", "Tropical", 2);
        Calopsita calopsita1 = new Calopsita("Pipoca", "Cacatuidae", "Fêmea", "Cinza e Amarelo", "Doméstico", 1);
        Galinha galinha1 = new Galinha("Clara", "Phasianidae", "Fêmea", "Branca", "Doméstico", 2);
        Iguana iguana1 = new Iguana("Iggy", "Iguanidae", "Macho", "Verde", "Tropical", 4);
        Pardal pardal1 = new Pardal("Piu", "Passeridae", "Macho", "Marrom e Cinza", "Doméstico", 1);
        Tartaruga tartaruga1 = new Tartaruga("Tartaruguinha", "Cheloniidae", "Fêmea", "Verde", "Oceano", 10);

        //Todas as informações de cada animal

        System.out.println(cachorro1);
        System.out.println(gato1);
        System.out.println(arara1);
        System.out.println(calopsita1);
        System.out.println(galinha1);
        System.out.println(iguana1);
        System.out.println(pardal1);
        System.out.println(tartaruga1);

        //Acoes de cada classe

        cachorro1.emitirSom();
        gato1.emitirSom();
        arara1.emitirSom();
        calopsita1.emitirSom();
        galinha1.emitirSom();
        iguana1.emitirSom();
        pardal1.emitirSom();
        
        tartaruga1.botarOvo();
        cachorro1.correr();
        gato1.dormir();
        calopsita1.brincar();
        iguana1.correr();
        tartaruga1.dormir();

    }
}
