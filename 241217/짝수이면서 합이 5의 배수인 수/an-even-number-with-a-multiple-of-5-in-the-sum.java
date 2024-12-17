import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.print(judgeNum(n));

        sc.close();
    }

    private static String judgeNum(int n) {
        int onesDigit = n % 10;
        int tensDigit = n / 10;

        return (n % 2 == 0 && (onesDigit + tensDigit) % 5 == 0)? "Yes" : "No";
    }
}