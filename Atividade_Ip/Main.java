package Atividade_Ip;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o endereço de IP 1(xxx.xxx.xxx.xxx): ");
        String ip1 = scanner.nextLine();
        System.out.print("Digite o endereço de IP 2(xxx.xxx.xxx.xxx): ");
        String ip2 = scanner.nextLine();
        System.out.print("Digite a máscara da rede(número 1 a 32): ");
        int numMask = scanner.nextInt();
        Network network1 = new Network(ip1, ip2, numMask);
        System.out.println(network1.SameNetwork());
        scanner.close();
    }
}
