import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int result = 0;
        for (int i = m1; i < m2; i++) {
            result += days[i - 1];
        }
        result += d2 - d1 + 1;

        System.out.println(result);

        sc.close();
    }
}