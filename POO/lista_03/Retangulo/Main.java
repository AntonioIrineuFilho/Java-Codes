package POO.lista_03.Retangulo;
import java.util.Scanner;

public class Main {
    public void calcArea(Retangulo retangulo) {
        System.out.println(String.format("Área = %.2f", retangulo.CalcArea()));
    }
    public void calcDiagonal(Retangulo retangulo) {
        System.out.println(String.format("Diagonal = %.2f", retangulo.CalcDiagonal()));
    }
    public void getValores(Retangulo retangulo) {
        System.out.println(retangulo.ToString());
    }
    public void setValores(Scanner scanner, Retangulo retangulo) {
        boolean run = true;
        while (run) {
            System.out.println("1-Alterar base\n2-Alterar altura\n3-Sair");
            System.out.print("Digite a opção desejada: ");
            int op = scanner.nextInt();
            while (true) {
                if (op < 1 || op > 3) {
                    System.out.print("Opção inválida. Digite uma opção válida: ");
                    op = scanner.nextInt();
                } else {
                    break;
                }
            }
            switch (op) {
                case 1:
                    System.out.print("Digite a nova base: ");
                    double base = scanner.nextDouble();
                    retangulo.setBase(base);
                    break;
                case 2:
                    System.out.print("Digite a nova altura: ");
                    double altura = scanner.nextDouble();
                    retangulo.setAltura(altura);
                    break;
                case 3:
                    run = false;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base: ");
        double base = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        Retangulo retangulo1 = new Retangulo(base, altura);
        boolean run = true;
        while (run) {
            System.out.println("1-Calcular área\n2-Calcular diagonal\n3-Ver valores\n4-Alterar valores\n5-Sair");
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
                    main.calcArea(retangulo1);
                    break;
                case 2:
                    main.calcDiagonal(retangulo1);
                    break;
                case 3:
                    main.getValores(retangulo1);
                    break;
                case 4:
                    main.setValores(scanner, retangulo1);
                    break;
                case 5:
                    System.out.println("FIM DE EXECUÇÃO.");
                    run = false;
                    break;
            }
        }
        scanner.close();
    }
}
