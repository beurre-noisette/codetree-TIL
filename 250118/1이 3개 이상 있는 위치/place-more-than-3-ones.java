import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] gird = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                gird[i][j] = sc.nextInt();
            }
        }

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int answer = 0;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                int count = 0;

                for (int k = 0; k < 4; k++) {
                    int nx = x + dx[k];
                    int ny = y + dy[k];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && gird[nx][ny] == 1) {
                        count++;
                    }
                }

                if (count >= 3) {
                    answer++;
                }
            }
        }

        System.out.println(answer);

        sc.close();
    }
}