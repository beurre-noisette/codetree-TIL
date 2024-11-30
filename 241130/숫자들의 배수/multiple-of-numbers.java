import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int multiplicand = sc.nextInt();
        int multiplier = 1;
        int cnt = 0;

        while (true) {
            if (multiplicand * multiplier % 5 == 0) {
                cnt++;
            }

            if (cnt == 2) {
                System.out.print((multiplicand * multiplier) + " ");
                break;
            }

            System.out.print((multiplicand * multiplier) + " ");

            multiplier++;
        }

        sc.close();
    }
}