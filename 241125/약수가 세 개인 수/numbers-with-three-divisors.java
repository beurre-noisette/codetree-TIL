import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int cntAnswer = 0;

        for (int i = start; i <= end; i++) {
            int cntFactor = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cntFactor++;
                }
            }

            if (cntFactor == 3) {
                cntAnswer++;
            }
        }

        System.out.print(cntAnswer);

        sc.close();
    }
}