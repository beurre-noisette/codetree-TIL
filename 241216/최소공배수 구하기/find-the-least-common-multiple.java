import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(getLcm(a, b));

        sc.close();
    }

    private static int getGcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;

            a = b;

            b = temp;
        }

        return a;
    }

    private static int getLcm(int a, int b) {
        int gcd = getGcd(a, b);

        return a * (b / gcd);
    }
}