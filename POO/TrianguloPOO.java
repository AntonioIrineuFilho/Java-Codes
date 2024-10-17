import java.util.Scanner;

public class TrianguloPOO {
    public static class Triangulo {
        private double b, h;
        public Triangulo(double b, double h) {
            this.b = b;
            this.h = h;
        }
        public double calcArea() {
            double area = this.b * this.h / 2;
            return area;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base e altura: ");
        Triangulo triangulo = new Triangulo(scanner.nextDouble(), scanner.nextDouble());
        System.out.println(String.format("A área do triângulo é: %.1f", triangulo.calcArea()));
        scanner.close();
    }
}
