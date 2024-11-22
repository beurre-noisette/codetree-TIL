import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 1) {
                    System.out.print(((i + 1) * n - j) + " ");
                } else {
                    System.out.print((i * n + j + 1) + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}