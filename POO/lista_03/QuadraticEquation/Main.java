package POO.lista_03.QuadraticEquation;
import java.util.Scanner;

public class Main {
    public void CalcDelta(QuadraticEquation obj) {
        System.out.println(String.format("Delta = %.2f", obj.Delta()));
    }
    public void CalcR1(QuadraticEquation obj) {
        System.out.println(String.format("Raiz 1 = %.2f", obj.Raiz1()));
    }
    public void CalcR2(QuadraticEquation obj) {
        System.out.println(String.format("Raiz 2 = %.2f", obj.Raiz2()));
    }
    public void getValores(QuadraticEquation obj) {
        System.out.println(obj.ToString());
    }
    public void setValores(Scanner scanner, QuadraticEquation obj) {
        boolean run = true;
        while (run) {
            System.out.println("1-Alterar A\n2-Alterar B\n3-Alterar C\n4-Sair");
            System.out.print("Digite a opção desejada: ");
            int op = scanner.nextInt();
            while (true) {
                if (op < 1 || op > 4) {
                    System.out.print("Opção inválida. Digite uma opção válida: ");
                    op = scanner.nextInt();
                } else {
                    break;
                }
            }
            switch (op) {
                case 1:
                    System.out.print("Digite o novo valor de A: ");
                    double a = scanner.nextDouble();
                    obj.setNumA(a);
                    break;
                case 2:
                    System.out.print("Digite o novo valor de B: ");
                    double b = scanner.nextDouble();
                    obj.setNumB(b);
                    break;
                case 3:
                    System.out.print("Digite o novo valor de C: ");
                    double c = scanner.nextDouble();
                    obj.setNumC(c);
                    break;
                case 4:
                    run = false;
                    break;
            }
        }
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os coeficientes a, b e c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        QuadraticEquation obj = new QuadraticEquation(a, b, c);
        boolean run = true;
        while (run) {
            System.out.println("1-Calcular delta\n2-Calcular primeira raiz\n3-Calcular segunda raiz\n4-Ver valores\n5-Alterar valores\n6-Sair");
            System.out.print("Digite a opção desejada: ");
            int op = scanner.nextInt();
            while (true) {
                if (op < 1 || op > 6) {
                    System.out.print("Opção inválida. Digite uma opção válida: ");
                    op = scanner.nextInt();
                } else {
                    break;
                }
            }
            switch (op) {
                case 1:
                    main.CalcDelta(obj);
                    break;
                case 2:
                    main.CalcR1(obj);
                    break;
                case 3:
                    main.CalcR2(obj);
                    break;
                case 4:
                    main.getValores(obj);
                    break;
                case 5:
                    main.setValores(scanner, obj);
                case 6:
                    System.out.println("FIM DE EXECUÇÃO.");
                    run = false;
                    break;   
            }
        }
        scanner.close();
    }
}
