import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space < i; space++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(cnt + " ");
                cnt++;

                if (cnt > 9) {
                    cnt = 1;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}