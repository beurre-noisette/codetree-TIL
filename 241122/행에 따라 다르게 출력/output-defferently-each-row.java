import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 1) {
                    System.out.print(cnt + " ");
                    if (j == n) {
                        cnt += 2;
                    } else {
                        cnt++;
                    }
                } else {
                    System.out.print(cnt + " ");
                    if (j == n) {
                        cnt++;
                    } else {
                        cnt += 2;
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}