import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int totalTime = 0;
        int[][] movesA = new int[n][2];
        int[][] movesB = new int[m][2];
        
        for(int i = 0; i < n; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            movesA[i][0] = d == 'L' ? -1 : 1;
            movesA[i][1] = t;
            totalTime += t;
        }
        
        for(int i = 0; i < m; i++) {
            char d = sc.next().charAt(0);
            int t = sc.nextInt();
            movesB[i][0] = d == 'L' ? -1 : 1;
            movesB[i][1] = t;
        }
        
        int[] posA = new int[totalTime + 1];
        int[] posB = new int[totalTime + 1];
        
        int time = 1;
        int pos = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < movesA[i][1]; j++) {
                pos += movesA[i][0];
                posA[time++] = pos;
            }
        }
        
        time = 1;
        pos = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < movesB[i][1]; j++) {
                pos += movesB[i][0];
                posB[time++] = pos;
            }
        }
        
        for(int i = 1; i <= totalTime; i++) {
            if(posA[i] == posB[i]) {
                System.out.print(i);
                return;
            }
        }
        
        System.out.print(-1);
        sc.close();
    }
}