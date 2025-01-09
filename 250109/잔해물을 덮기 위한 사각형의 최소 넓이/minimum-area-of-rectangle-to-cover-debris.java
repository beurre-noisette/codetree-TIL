import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] area = new int[2001][2001];
        
        int x1 = sc.nextInt() + 1000;
        int y1 = sc.nextInt() + 1000;
        int x2 = sc.nextInt() + 1000;
        int y2 = sc.nextInt() + 1000;
        
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                area[i][j] = 1;
            }
        }
        
        x1 = sc.nextInt() + 1000;
        y1 = sc.nextInt() + 1000;
        x2 = sc.nextInt() + 1000;
        y2 = sc.nextInt() + 1000;
        
        for (int i = x1; i < x2; i++) {
            for (int j = y1; j < y2; j++) {
                area[i][j] = 0;
            }
        }
        
        int minX = 2001, minY = 2001;
        int maxX = 0, maxY = 0;
        
        for (int i = 0; i < 2001; i++) {
            for (int j = 0; j < 2001; j++) {
                if (area[i][j] == 1) {
                    minX = Math.min(minX, i);
                    minY = Math.min(minY, j);
                    maxX = Math.max(maxX, i);
                    maxY = Math.max(maxY, j);
                }
            }
        }
        
        if (minX == 2001 || minY == 2001) {
            System.out.print(0);
        } else {
            int width = maxX - minX + 1;
            int height = maxY - minY + 1;
            System.out.print(width * height);
        
        
        sc.close();
    }
}
}

/*
(1) 첫 번째 직사각형이 먼저 놓여있고,
(2) 두 번째 직사각형이 그 다음 놓여졌을 때
(3) 그 이후에 남아있는 첫 번째 직사각형의 잔해물을 덮기 위한 최소 직사각형의 넓이는?
*/