import java.util.Scanner;

public class Display100PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Primes from 2 to 100 are:");
        int N = 2;
        for (int i = 2; i < 100; i++) {
            if (N < 2) {
                System.out.println("Wrong!");
            } else {
                boolean check = true;
                for (int j = 2; j <= Math.sqrt(N); j++) {
                    if (N % j == 0) {
                        check = false;
                        break;
                    }
                }
                if (check) {
                    System.out.println(N);
                }
                N++;
            }
        }
    }
}
