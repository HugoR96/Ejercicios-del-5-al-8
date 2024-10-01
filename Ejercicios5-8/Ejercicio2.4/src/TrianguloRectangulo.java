/*public class TrianguloRectangulo {
        int base;
        int altura;

        TrianguloRectangulo(int base, int altura) {
            this.base = base;
            this.altura = altura;
        }
        double calcularArea() {
            return (base * altura / 2);
        }
        double calcularPerímetro() {
            return (base + altura + calcularHipotenusa());
        }
        double calcularHipotenusa() {
            return Math.pow(base*base + altura*altura, 0.5);
        }
        void determinarTipoTriangulo() {
            if ((base == altura) && (base == calcularHipotenusa()) && (altura
                    == calcularHipotenusa()))
                System.out.println("Es un triángulo equilátero");
            else if ((base != altura) && (base != calcularHipotenusa()) &&
                    (altura != calcularHipotenusa()))
                System.out.println("Es un triángulo escaleno");
            else
                System.out.println("Es un triángulo isósceles");
        }
    }/*

 */
public class TrianguloRectangulo extends Triangulo{
    public TrianguloRectangulo(double base, double altura,double lado1,double lado2, double lado3) {
        super(base, altura,base,Math.sqrt(base*base+altura*altura),altura);
    }
}
