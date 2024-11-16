package POO.lista_03.Data;
import java.util.Scanner;

public class Main {
    public void verData(Data data) {
        System.out.println(data.ToString());
    }
    public void verDia(Data data) {
        System.out.println(String.format("Dia = %d", data.getDia()));
    }
    public void verMes(Data data) {
        System.out.println(String.format("Mês = %d", data.getMes()));
    }
    public void verAno(Data data) {
        System.out.println(String.format("Ano = %d", data.getAno()));
    }
    public void alterarData(Scanner scanner, Data data) {
        System.out.print("Digite a nova data(dd/mm/aaaa): ");
        String d = scanner.nextLine();
        data.setData(d);
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data(dd/mm/aaaa): ");
        String d = scanner.nextLine();
        Data data = new Data(d);
        boolean run = true;
        while (run) {
            System.out.println("1-Exibir data completa\n2-Exibir dia\n3-Exibir mês\n4-Exibir ano\n5-Alterar data\n6-Sair");
            System.out.print("Digite a opção desejada: ");
            int op = scanner.nextInt();
            scanner.nextLine();
            while (true) {
                if (op < 1 || op > 6) {
                    System.out.print("Opção inválida. Digite uma opção válida: ");
                    op = scanner.nextInt();
                    scanner.nextLine();
                } else {
                    break;
                }
            }
            switch (op) {
                case 1:
                    main.verData(data);
                    break;
                case 2:
                    main.verDia(data);
                    break;
                case 3:
                    main.verMes(data);
                    break;
                case 4:
                    main.verAno(data);
                    break;
                case 5:
                    main.alterarData(scanner, data);
                    break;
                case 6:
                    System.out.println("FIM DE EXECUÇÃO.");
                    run = false;
                    break;
            }
        }
        scanner.close();
    }
}
