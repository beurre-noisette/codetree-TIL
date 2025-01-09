import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] area = new int[300][300];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt() + 100;
            int y = sc.nextInt() + 100;

            for (int j = x; j < x + 8; j++) {
                for (int k = y; k < y + 8; k++) {
                    if (area[j][k] == 0) {
                        area[j][k]++;
                    }
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < 300; i++) {
            for (int j = 0; j < 300; j++) {
                if (area[i][j] == 1) {
                    sum++;
                }
            }
        }

        System.out.print(sum);

        sc.close();
    }
}

/*
(1) 가로세로 길이가 8이고, 넓이가 64인 색종이 N장이 주어짐
(2) 색종이 각 좌측하단의 꼭짓점이 주어졌을 때
(3) 모든 색종이가 붙여진 이후의 총 넓이를 구하는 프로그램을 작성
(4) 1 <= N <= 100 | 좌표평면 위에서 (-100, -100) ~ (100, 100) 사이로 들어옴
*/