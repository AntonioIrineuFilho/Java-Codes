import java.util.Scanner;

public class Main {
    public void verInteira(Scanner scanner) {
        System.out.print("Digite o dia desejado: ");
        int d = scanner.nextInt();
        System.out.print("Digite o horário desejado: ");
        double h = scanner.nextDouble();
        Entrada entrada = new Entrada(d, h);
        System.out.println(String.format("Valor da sessão inteira no dia e horário desejados: %.2f", entrada.Inteira(d, h)));
    }
    public void verMeia(Scanner scanner) {
        System.out.print("Digite o dia desejado: ");
        int d = scanner.nextInt();
        System.out.print("Digite o horário desejado: ");
        double h = scanner.nextDouble();
        Entrada entrada = new Entrada(d, h);
        System.out.println(String.format("Valor da sessão meia no dia e horário desejados: %.2f", entrada.Meia(d, h)));
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("1-Ver Inteira\n2-Ver Meia\n3-Sair");
            System.out.print("Digite a opção desejada: ");
            int op = scanner.nextInt();
            if (op == 1) {
                main.verInteira(scanner);
            } else if (op == 2) {
                main.verMeia(scanner);
            } else if (op == 3) {
                run = false;
            } else {
                System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
