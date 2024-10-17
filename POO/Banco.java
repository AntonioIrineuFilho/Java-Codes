import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Banco {
    public static class Cliente {
        private String nome;
        private int conta;
        private double saldo;
        public Cliente(){

        }
        public Cliente(String nome, int conta, double saldo) {
            this.nome = nome;
            this.conta = conta;
            this.saldo = saldo;
        }
        public void Deposito(double acrescimo) {
            this.saldo = this.saldo + acrescimo;
        }
        public void Saque(double retirado) {
            this.saldo = this.saldo - retirado;
        }
        public double VerSaldo() {
            return this.saldo;
        }
    }
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", 12345, 600);
        Cliente cliente2 = new Cliente("Amanda", 12346, 2400);
        Cliente cliente3 = new Cliente("Carlos", 12347, 10000);
        ArrayList<Cliente> clientes = new ArrayList<>(Arrays.asList(cliente1, cliente2, cliente3));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.print("Digite o número da sua conta: ");
        int num_conta = scanner.nextInt();
        boolean verificar = false;
        Cliente cliente_now = new Cliente();
        for (Cliente cliente : clientes) {
            if (cliente.nome.equals(name) && cliente.conta == num_conta) {
                verificar = true;
                cliente_now = cliente;
            }
        }
        int op = 0;
        if (verificar == false) {
            System.out.println("Cliente não identificado.");
            System.exit(0);
        } else {
            System.out.println("Cliente identificado com sucesso!");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Ver saldo");
            System.out.print("Digite o número da operação desejada: ");
            op = scanner.nextInt();
        }

        if (op == 1) {
            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();
            cliente_now.Deposito(valor);
            System.out.println(String.format("Depósito realizado! Seu saldo agora é R$ %.2f", cliente_now.VerSaldo()));
        } else if (op == 2) {
            System.out.print("Digite o valor: ");
            double valor = scanner.nextDouble();
            cliente_now.Saque(valor);
            System.out.println(String.format("Saque realizado! Seu saldo agora é R$ %.2f", cliente_now.VerSaldo()));
        } else if (op == 3) {
            System.out.println(String.format("Seu saldo atual é R$ %.2f", cliente_now.VerSaldo()));
        } else {
            System.out.println("Opção digitada inválida.");
        }
        scanner.close();
    }
}
