import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scNome = new Scanner(System.in);
        System.out.print("");
        String nome = scNome.nextLine();
        Scanner scSal = new Scanner(System.in);
        System.out.print("");
        double salario = Double.parseDouble(scSal.nextLine());
        Scanner scVendas = new Scanner(System.in);
        System.out.print("");
        double vendas = Double.parseDouble(scVendas.nextLine());
        double total = salario + (vendas * 0.15);
        System.out.println(String.format("TOTAL = R$ %.2f", total));


    }
}
