public class Pentagono extends FormaGeometrica{
    private double lado;

    public Pentagono(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do pentágono deve ser maior que zero.");
        }
        this.lado = lado;
    }

    
    @Override
    public double getArea() {
        return (5 * lado * lado) /
                (4 * Math.tan(Math.PI / 5));
    }
    
    @Override
    public double getPerimetro() {
        return 5 * lado;
    }
    
    public int getNumeroLados() {
        return 5;
    }
}
