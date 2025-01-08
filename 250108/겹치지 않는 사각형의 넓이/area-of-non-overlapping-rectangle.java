import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] square = new int[2000][2000];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            int x1 = sc.nextInt() + 1000;
            int y1 = sc.nextInt() + 1000;
            int x2 = sc.nextInt() + 1000;
            int y2 = sc.nextInt() + 1000;

            if (i < 2) {
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        square[j][k]++;
                    }
                }
            } else {
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        square[j][k] = 0;
                    }
                }
            }
        }

        for (int i = 0; i < 2000; i++) {
            for (int j = 0; j < 2000; j++) {
                if (square[i][j] > 0) {
                    sum++;
                }
            }
        }

        System.out.println(sum);

        sc.close();
    }
}