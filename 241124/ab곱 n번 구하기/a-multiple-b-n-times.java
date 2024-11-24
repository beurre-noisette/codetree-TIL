import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum = 1;

            for (int j = start; j <= end; j++) {
                sum = sum * j;
            }
            System.out.println(sum);
            sum = 1;
        }

        sc.close();
    }
}