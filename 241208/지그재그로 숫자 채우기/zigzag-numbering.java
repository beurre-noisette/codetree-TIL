import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr2d = new int[row][col];
        int num = 0;

        for (int i = 0; i < col; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < row; j++) {
                    arr2d[j][i] = num++;
                }
            } else {
                for (int j = row - 1; j >= 0; j--) {
                    arr2d[j][i] = num++;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}