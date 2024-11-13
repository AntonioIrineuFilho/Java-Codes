package POO.lista_03.Frete;
import java.util.Scanner;

public class Main {
    public void calcFrete(Frete frete) {
        System.out.println(String.format("Valor do frete = R$ %.2f", frete.CalcFrete()));
    }
    public void getValores(Frete frete) {
        System.out.println(frete.ToString());
    }
    public void setValores(Scanner scanner, Frete frete) {
        boolean run = true;
        while (run) {
            System.out.println("1-Alterar peso\n2-Alterar distância\n3-Sair");
            System.out.print("Digite a opção desejada: ");
            int op = scanner.nextInt();
            while (true) {
                if (op < 1 || op > 3) {
                    System.out.print("Opção inválida. Digite uma opçaõ válida: ");
                    op = scanner.nextInt();
                } else {
                    break;
                }
            }
            switch (op) {
                case 1:
                    System.out.print("Digite o novo peso: ");
                    double peso = scanner.nextDouble();
                    frete.setPeso(peso);
                    break;
                case 2:
                    System.out.print("Digite a nova distância: ");
                    double distancia = scanner.nextDouble();
                    frete.setDistancia(distancia);
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
        System.out.print("Digite o peso da carga: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a distância da viagem: ");
        double distancia = scanner.nextDouble();
        Frete frete1 = new Frete(peso, distancia);
        boolean run = true;
        while (run) {
            System.out.println("1-Calcular frete\n2-Ver valores\n3-Alterar valores\n4-Sair");
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
                    main.calcFrete(frete1);
                    break;
                case 2:
                    main.getValores(frete1);
                    break;
                case 3:
                    main.setValores(scanner, frete1);
                    break;
                case 4:
                    System.out.println("FIM DE EXECUÇÃO.");
                    run = false;
                    break;
            }
        }
        scanner.close();
    }
}
