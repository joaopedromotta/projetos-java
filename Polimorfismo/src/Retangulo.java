public class Retangulo extends FormaGeometrica{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        if (largura <= 0 || altura <= 0) {
            throw new IllegalArgumentException("A largura e a altura do retângulo devem ser maiores que zero.");
            
        }
        this.largura = largura;
        this.altura = altura;
    }
    
    @Override
    public double getArea() {
        return largura * altura;
    }
    
    @Override
    public double getPerimetro() {
        return 2 * (largura + altura);
    }
    
    public boolean isQuadrado() {
        return largura == altura;
    }

}
