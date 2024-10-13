import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Cedulas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("");
        int valor = Integer.parseInt(scanner.nextLine());
        int valorCopy = valor;
        ArrayList<Integer> cedulas = new ArrayList<>(Arrays.asList(100, 50, 20, 10, 5, 2, 1));
        ArrayList<Integer> notas = new ArrayList<>();
        int cont = 0;
        while (cont <= 6) {
            notas.add(valor / cedulas.get(cont));
            valor = valor % cedulas.get(cont);
            cont++;
        }
        System.out.println(valorCopy);
        for (int i = 0; i <= 6; i++) {
            System.out.println(String.format("%d nota(s) de R$ %d,00", notas.get(i), cedulas.get(i)));
        }

        scanner.close();
    }
}
