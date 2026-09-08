
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

        cachorro1.latir();
        gato1.miar();
        arara1.gritar();
        calopsita1.cantar();
        galinha1.cacarejar();
        iguana1.sibilo();
        pardal1.piar();
        tartaruga1.botarOvo(tartaruga1.getNome());
    }
}
