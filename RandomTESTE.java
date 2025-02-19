import java.util.Random;

public class RandomTESTE {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt((99999999 - 10000000) - 1) + 10000000;
        String numSTR = String.valueOf(num);
        System.out.println(String.format("O número aleatório é %s", numSTR));
    }
}