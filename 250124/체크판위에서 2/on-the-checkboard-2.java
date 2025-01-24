import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char[][] grid = new char[R][C];
        
        sc.nextLine();
        
        for (int i = 0; i < R; i++) {
            String line = sc.nextLine().trim();
            String[] tokens = line.split(" ");
            for (int j = 0; j < C; j++) {
                grid[i][j] = tokens[j].charAt(0);
            }
        }
        sc.close();

        int count = 0;
        char startColor = grid[0][0];
        char endColor = grid[R-1][C-1];

        for (int i = 1; i <= R-3; i++) {
            for (int j = 1; j <= C-3; j++) {
                char aColor = grid[i][j];
                if (aColor != startColor) {
                    for (int k = i+1; k <= R-2; k++) {
                        for (int l = j+1; l <= C-2; l++) {
                            char bColor = grid[k][l];
                            if (aColor != bColor && bColor != endColor) {
                                count++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}