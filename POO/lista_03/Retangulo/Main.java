package POO.lista_03.Retangulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        Retangulo retangulo1 = new Retangulo(base, altura);
        boolean run = true;
        while (run) {
            System.out.println("1-Calcular área\n2-Calcular altura\n3-Ver valores\n4-Alterar valores\n5-Sair");
            System.out.print("Digite a opção desejada: ");
            int op = scanner.nextInt();
            while (true) {
                if (op < 1 || op > 5) {
                    System.out.print("Opção inválida. Digite uma opção válida: ");
                    op = scanner.nextInt();
                } else {
                    break;
                }
            }
            switch (op) {
                case 1:
                    Main.calcArea(retangulo1);
                    break;
                case 2:
                    Main.calcDiagonal(retangulo1);
                    break;
                case 3:
                    Main.getValores(retangulo1);
                case 4:
                    Main.setValores(scanner, retangulo1);
                case 5:
                    break;
            }
        }
    }
}
