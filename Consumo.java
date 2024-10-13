import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int distancia = Integer.parseInt(scanner.nextLine());
        System.out.print("");
        double combustivel = Double.parseDouble(scanner.nextLine());
        double consumo = distancia / combustivel;
        System.out.println(String.format("%.3f km/l", consumo));

        scanner.close();
    }
}
