public class Quadrado extends Quadrilatero{
    
    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
    }

    @Override
    public double calcularArea() {
        double lado = calcularPerimetro() / 4;
        return lado * lado;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("\nTipo: Quadrado");
        System.out.printf("Área: %.2f%n", calcularArea());
        System.out.printf("Perímetro: %.2f%n", calcularPerimetro());
    }
}
