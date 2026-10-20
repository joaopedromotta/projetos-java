public abstract class FormaGeometrica {
    
    public abstract double getArea();
    public abstract double getPerimetro();

    public double getArea(int casasDecimais) {
        return arredondar(getArea(), casasDecimais);
    }

    public double getPerimetro(int casasDecimais) {
        return arredondar(getPerimetro(), casasDecimais);
    }

    private double arredondar(double valor, int casasDecimais) {
        if (casasDecimais < 0 || casasDecimais > 10) {
            System.out.println("O número de casas decimais não pode ser negativo.");
            return valor;
        }
        double fator = Math.pow(10, casasDecimais);
        return Math.round(valor * fator) / fator;
    }
}
