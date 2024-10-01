public class Cuadrado extends FiguraGeometricas {
int lado;
    Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado *lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
}


