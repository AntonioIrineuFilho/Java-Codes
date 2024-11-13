import java.util.Scanner;

public class Circulo {
    public static class Circle {
        private double raio;
        public Circle(double raio) {
            this.raio = raio;
        }
        public double Area() {
            double area = this.raio * this.raio * 3.14;
            return area;
        }
        public double Circunferencia() {
            double circunferencia = 2 * this.raio * 3.14;
            return circunferencia;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o raio do círculo: ");
        double r = scanner.nextDouble();
        Circle circulo1 = new Circle(r);
        System.out.println(String.format("Raio do círculo = %.1f", circulo1.Area()));
        System.out.println(String.format("Circunferência do círculo = %.1f", circulo1.Circunferencia()));


        scanner.close();
    }
}