import java.util.Scanner;

public class Main {
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};

    static int getDirectionIndex(char dir) {
        switch (dir) {
            case 'W': return 0;
            case 'S': return 1;
            case 'N': return 2;
            case 'E': return 3;
            default: return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int curX = 0, curY = 0;

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();

            int idx = getDirectionIndex(direction);

            curX += dx[idx] * distance;
            curY += dy[idx] * distance;
        }

        System.out.print(curX + " " + curY);
        
        sc.close();
    }
}

/*
W, S, N, E로 방향을 줌

W = 서쪽 1
E = 동쪽 1
N = 북쪽 1
S = 남쪽 1

1 <= N <= 100
1 <= 한 번에 움직이는 거리 <= 10
*/