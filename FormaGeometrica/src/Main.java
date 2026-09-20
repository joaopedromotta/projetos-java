import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(5));
        formas.add(new Triangulo(6, 4, 5, 5));
        formas.add(new Quadrado(4));
        formas.add(new Retangulo(8, 5));

        for (Forma forma : formas) {
            forma.exibirInformacoes();
        }
    }
}
