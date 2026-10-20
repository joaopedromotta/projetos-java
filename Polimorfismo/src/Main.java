
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<FormaGeometrica> figuras = new ArrayList<>();

        figuras.add(new Triangulo(1, 4, 5));
        figuras.add(new Circunferencia(5));
        figuras.add(new Pentagono(5));
        figuras.add(new Retangulo(4, 6));

        // Figuras de TESTES
        figuras.add(new Triangulo(6, 6, 6));
        figuras.add(new Triangulo(5, 5, 6));
        figuras.add(new Retangulo(4, 4));
        figuras.add(new Retangulo(8, 3));
        figuras.add(new Circunferencia(5));
        figuras.add(new Circunferencia(2));
        figuras.add(new Pentagono(6));
        figuras.add(new Pentagono(3));

        System.out.println("\n\n=== FIGURAS GEOMETRICAS ===");

        for (FormaGeometrica firgura : figuras) {

            System.out.println(
                "Classe: " + firgura.getClass()
            );
            System.out.println(
                "Posicao no Array: " + figuras.indexOf(firgura)
            );

            System.out.printf(
                "Area: %.2f%n", firgura.getArea()
            );

            System.out.printf(
                "Perimetro: %.2f%n", firgura.getPerimetro()
            );

            // Sobrecarga: calculos arredondados
            System.out.printf(
                "Area (1 casa decimal): %.1f%n",
                firgura.getArea(1)
            );

            System.out.printf(
                "Perimetro (1 casa decimal): %.1f%n",
                firgura.getPerimetro(1)
            );

            System.out.println();
        }

        System.out.println("****** METODOS EXCLUSIVOS ******\n\n");

        mostrarDiametros(figuras);
        mostrarQuadrados(figuras);
        mostrarTiposTriangulo(figuras);
        mostrarLadosPentagono(figuras);
    }

    public static void mostrarDiametros(
            ArrayList<FormaGeometrica> figuras) {

        System.out.println("=== CIRCUNFERENCIAS ===");

        for (FormaGeometrica firgura : figuras) {
            if (firgura instanceof Circunferencia c) {
                System.out.println(
                    "Posicao no Array: " + figuras.indexOf(firgura)
                );
                System.out.printf(
                    "Diametro: %.2f%n", c.getDiametro()
                );
                System.out.println();
            }
        }
    }

    public static void mostrarQuadrados(
            ArrayList<FormaGeometrica> figuras) {

        System.out.println("\n=== RETANGULOS ===");

        for (FormaGeometrica firgura : figuras) {
            if (firgura instanceof Retangulo) {
                Retangulo r = (Retangulo) firgura;

                System.out.println(
                    "Posicao no Array: " + figuras.indexOf(firgura)
                );
                System.out.println(
                    "E quadrado: " + r.isQuadrado() + "\n"
                );
            }
        }
    }

    public static void mostrarTiposTriangulo(
            ArrayList<FormaGeometrica> figuras) {

        System.out.println("\n=== TRIANGULOS ===");

        for (FormaGeometrica firgura : figuras) {
            if (firgura instanceof Triangulo) {
                Triangulo t = (Triangulo) firgura;

                System.out.println(
                    "Posicao no Array: " + figuras.indexOf(firgura)
                );
                System.out.println(
                    "Tipo: " + t.getTipoTriangulo() + "\n"
                );
            }
        }
    }

    public static void mostrarLadosPentagono(
            ArrayList<FormaGeometrica> figuras) {

        System.out.println("\n=== PENTAGONOS ===");

        for (FormaGeometrica firgura : figuras) {
            if (firgura instanceof Pentagono p) {
                System.out.println(
                    "Posicao no Array: " + figuras.indexOf(firgura)
                );
                System.out.println(
                    "Numero de lados: " + p.getNumeroLados() + "\n"
                );
            }
        }
    }
}
