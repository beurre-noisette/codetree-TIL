import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(gcd(n, m));

        sc.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;

            a = b;

            b = temp;
        }

        return a;
    }
}