import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] sqaure = new int[200][200];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            // (x1, y1) ~ (x2 - 1, y2 - 1)
            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    sqaure[j][k]++;
                }
            }
        }
        
        for (int i = 0; i < 200; i++) {
            for (int j = 0; j < 200; j++) {
                if (sqaure[i][j] > 0) {
                    sum++;
                }
            }
        }

        System.out.println(sum);

        sc.close();
    }
}