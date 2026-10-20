public class Circunferencia extends FormaGeometrica {
    private double raio;

    public Circunferencia(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio da circunferência deve ser maior que zero.");
            
        }
        this.raio = raio;
    }
    
    @Override
    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    @Override
    public double getPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    public double getDiametro() {
        return 2 * raio;
    }

}
