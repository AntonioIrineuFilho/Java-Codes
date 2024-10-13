import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        String nome = scanner.nextLine();
        System.out.print("");
        double salario = Double.parseDouble(scanner.nextLine());
        System.out.print("");
        double vendas = Double.parseDouble(scanner.nextLine());
        double total = salario + (vendas * 0.15);
        System.out.println(String.format("TOTAL = R$ %.2f", total));

        scanner.close();
    }
}
