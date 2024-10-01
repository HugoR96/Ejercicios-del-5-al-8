public class Rectangulo extends FiguraGeometricas{
        private double base;
        private double altura;
        Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base*base)+(altura+altura);
    }
}
