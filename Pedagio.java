import java.util.Scanner;

public class Pedagio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int tam_est = scanner.nextInt();
        int dist_ped = scanner.nextInt();
        System.out.print("");
        int custo_km = scanner.nextInt();
        int custo_ped = scanner.nextInt();
        int custo_total = tam_est * custo_km + ((tam_est / dist_ped) * custo_ped);
        System.out.println(custo_total);
        scanner.close();
    }
}
