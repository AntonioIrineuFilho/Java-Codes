import java.util.Scanner;

class Cliente {
    private String nome;
    private int conta;
    private double saldo;
    public Cliente(String nome, int conta, double saldo) {
        this.setNome(nome);
        this.setConta(conta);
        this.setSaldo(saldo);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getNome() {
        return this.nome;
    }
    public int getConta() {
        return this.conta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public double Depositar(double valor) {
        if (valor >= 0) {
            return this.saldo += valor;
        } else {
            throw new IllegalArgumentException("O VALOR NÃO PODE SER NEGATIVO");
        }
    }
    public double Sacar(double valor) {
        if (valor >= 0) {
            return this.saldo -= valor;
        } else {
            throw new IllegalArgumentException("O VALOR NÃO PODE SER NEGATIVO");
        }
    }
}

public class Banco2 {
    public static void realizarDeposito(Cliente cliente, Scanner scanner) {
        System.out.print("Digite o valor do depósito: ");
        double valor = scanner.nextDouble();
        cliente.Depositar(valor);
        System.out.println("Depósito bem-sucedido!");
    }
    public static void realizarSaque(Cliente cliente, Scanner scanner) {
        System.out.print("Digite o valor do saque: ");
        double valor = scanner.nextDouble();
        cliente.Sacar(valor);
        System.out.println("Saque bem-sucedido!");
    }
    public static void verSaldo(Cliente cliente) {
        System.out.println(String.format("Saldo atual: R$ %.2f", cliente.getSaldo()));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente1 = new Cliente("Fulano", 12345, 1000);
        boolean run = true;
        while (run) {
            System.out.println("1-Depositar\n2-Sacar\n3-Ver saldo\n4-Sair");
            System.out.print("Digite a opção desejada: ");
            int op = scanner.nextInt();
            while (true) {
                if (op == 1 || op == 2 || op == 3 || op == 4) {
                    break;
                } else {
                    System.out.print("Opção inválida. Digite a opção desejada: ");
                    op = scanner.nextInt();
                }
            }
            if (op == 1) {
                Banco2.realizarDeposito(cliente1, scanner);
            } else if (op == 2) {
                Banco2.realizarSaque(cliente1, scanner);
            } else if (op == 3) {
                Banco2.verSaldo(cliente1);
            } else {
                run = false;
            }
        }
    }
}
