import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] firstArr = new int[n][m];
        int[][] secondArr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                firstArr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                secondArr[i][j] = sc.nextInt();
            }
        }

        int[][] hasSameElement = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (firstArr[i][j] == secondArr[i][j]) {
                    hasSameElement[i][j] = 0;
                } else {
                    hasSameElement[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(hasSameElement[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}