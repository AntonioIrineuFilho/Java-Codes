import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3;
        System.out.print("0 1");
        for (int i = 0; i < (n-2); i++) {
            t3 = t1 + t2;
            System.out.print(" " + t3);
            t1 = t2;
            t2 = t3;
        }
        scanner.close();
    }
}
