import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] baseNum = new int[n];

        for (int i = 0; i < baseNum.length; i++) {
            baseNum[i] = sc.nextInt();
        }

        for (int i = baseNum.length - 1; i >= 0; i--) {
            if (baseNum[i] % 2 == 0 || baseNum[i] == 0) {
                System.out.print(baseNum[i] + " ");
            }
        }

        sc.close();
    }
}