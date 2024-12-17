import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(cnt(a, b));

        sc.close();
    }

    private static boolean contains369(int num) {
        while (num > 0) {
            int digit = num % 10;

            if (digit == 3 || digit == 6 || digit == 9) {
                return true;
            }

            num /= 10;
        }
        return false;
    }

    private static int cnt(int a, int b) {
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 || contains369(i)) {
                cnt++;
            }
        }

        return cnt;
    }
}