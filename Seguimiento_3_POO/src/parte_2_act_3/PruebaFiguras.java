package parte_2_act_3;
import java.util.Scanner;

public class PruebaFiguras {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();
        Circulo figura1 = new Circulo(radio);

        System.out.print("Ingresa la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();
        System.out.print("Ingresa la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();
        Rectangulo figura2 = new Rectangulo(baseRectangulo, alturaRectangulo);

        System.out.print("Ingresa el lado del cuadrado: ");
        double ladoCuadrado = scanner.nextDouble();
        Cuadrado figura3 = new Cuadrado(ladoCuadrado);

        System.out.print("Ingresa la base del triángulo rectángulo: ");
        double baseTriangulo = scanner.nextDouble();
        System.out.print("Ingresa la altura del triángulo rectángulo: ");
        double alturaTriangulo = scanner.nextDouble();
        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);

        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerímetro());

        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerímetro());

        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerímetro());

        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerímetro());

        figura4.determinarTipoTriángulo();

    
        scanner.close();
    }
}