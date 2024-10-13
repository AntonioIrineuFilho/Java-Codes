import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o peso total das cargas: ");
        int peso = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite a capacidade de cada container: ");
        int capacidade = Integer.parseInt(scanner.nextLine());
        int containers = peso / capacidade;
        if (peso % capacidade != 0) {
            containers = peso / capacidade + 1;
        }
        System.out.println(String.format("Quantidade de containers: %d\nPeso por container: %d", containers, (peso / containers)));
    }
}
