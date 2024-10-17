import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base e altura: ");
        double b = scanner.nextDouble();
        double h = scanner.nextDouble();
        double area = (b * h) / 2;
        System.out.println(String.format("A área do triângulo é: %.1f", area));
        scanner.close();

    }
}