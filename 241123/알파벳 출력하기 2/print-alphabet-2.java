import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char ascii = 'A';

        for (int i = 1; i <= n; i++) {
            for (int space = 2; space <= i; space++) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(ascii + " ");
                ascii++;
                if (ascii > 'Z') {
                    ascii = 'A';
                }
            }
            System.out.println();
        }

        sc.close();
    }
}