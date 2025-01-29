import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int[] x = new int[N];
        int[] y = new int[N];
        
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        int minDistance = Integer.MAX_VALUE;
        
        for (int skip = 1; skip < N-1; skip++) {
            int totalDistance = 0;
            
            for (int i = 0; i < N-1; i++) {
                if (i == skip) continue;
                
                int nextIndex = i + 1;
                if (nextIndex == skip) nextIndex++;
                
                if (nextIndex >= N) break;
                
                totalDistance += Math.abs(x[i] - x[nextIndex]) + 
                               Math.abs(y[i] - y[nextIndex]);
            }
            
            minDistance = Math.min(minDistance, totalDistance);
        }
        
        System.out.println(minDistance);
        sc.close();
    }
}