import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(calc(n));

        sc.close();
    }

    private static int calc(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }

        return sum / 10;
    }
}