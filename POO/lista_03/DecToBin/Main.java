package POO.lista_03.DecToBin;
import java.util.Scanner;

public class Main {
    public void CalcBin(DecToBin num) {
        System.out.println(String.format("O número %d em binário é %s", num.getNum(), num.Binario()));
    }
    public void getValor(DecToBin num) {
        System.out.println(num.ToString());
    }
    public void setValor(Scanner scanner, DecToBin num) {
        System.out.print("Digite o novo valor: ");
        int n = scanner.nextInt();
        num.setNum(n);
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = scanner.nextInt();
        DecToBin num = new DecToBin(n);
        boolean run = true;
        while (run) {
            System.out.println("1-Calcular binário\n2-Ver número\n3-Alterar número\n4-Sair");
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
                    main.CalcBin(num);
                    break;
                case 2:
                    main.getValor(num);
                    break;
                case 3:
                    main.setValor(scanner, num);
                    break;
                case 4:
                    System.out.println("FIM DA EXECUÇÃO.");
                    run = false;
                    break;
            }
        }
        scanner.close();
    }
}
