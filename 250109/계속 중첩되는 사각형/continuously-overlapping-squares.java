import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] base = new int[301][301];

        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt() + 100;
            int y1 = sc.nextInt() + 100;
            int x2 = sc.nextInt() + 100;
            int y2 = sc.nextInt() + 100;

            if (i % 2 == 0) {
                // Blue(1)
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        base[j][k] = 1;
                    }
                }
            } else {
                // Red(2)
                for (int j = x1; j < x2; j++) {
                    for (int k = y1; k < y2; k++) {
                        base[j][k] = 2;
                    }
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < 301; i++) {
            for (int j = 0; j < 301; j++) {
                if (base[i][j] == 1) {
                    sum++;
                }
            }
        }

        System.out.print(sum);

        sc.close();
    }
}

/*
(1) 총 n개의 직사각형이 주어짐
(2) 빨 -> 파 -> 빨 -> 파... 순으로 주어짐
(3) 겹치는 위치가 있다면 가장 마지막에 덮힌 색으로 취급함
(4) n개의 직사각형이 주어지고 난 뒤의 '파란색' 영역의 총 넓이를 구하시오
*/