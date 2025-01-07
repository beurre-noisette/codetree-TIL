import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] timeline = new int[101];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();

            for (int j = x1; j <= x2; j++) {
                timeline[j]++;
            }
        }

        int maxOverlap = 0;
        for (int i = 1; i <= 100; i++) {
            maxOverlap = Math.max(maxOverlap, timeline[i]);
        }

        System.out.println(maxOverlap);

        sc.close();
    }
}


/*
(1) 1차원 직선 상에 n개의 선분이 놓여있다.
(2) 가장 많이 겹치는 곳에서는 몇 개의 선분이 겹차지는지를 구해보시오
(3) 단, 끝점에서 닿는 경우에도 겹치는 것으로 합니다.
(4) 2 <= n <= 100 | 1<= x1 < x2 <= 100
*/