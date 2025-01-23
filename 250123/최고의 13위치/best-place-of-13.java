import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] square = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = sc.nextInt();
            }
        }

        int maxCnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxCnt = Math.max(maxCnt, square[i][j] + square[i][j + 1] + square[i][j + 2]);
            }
        }

        System.out.println(maxCnt);

        sc.close();
    }
}