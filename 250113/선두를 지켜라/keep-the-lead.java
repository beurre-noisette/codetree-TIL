import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] firstLine = br.readLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);
        int M = Integer.parseInt(firstLine[1]);
        
       
        int[][] A = new int[N][2];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            A[i][0] = Integer.parseInt(line[0]);
            A[i][1] = Integer.parseInt(line[1]);
        }
        
        
        int[][] B = new int[M][2];
        for (int i = 0; i < M; i++) {
            String[] line = br.readLine().split(" ");
            B[i][0] = Integer.parseInt(line[0]);
            B[i][1] = Integer.parseInt(line[1]);
        }
        
        
        int totalTime = 0;
        for (int i = 0; i < N; i++) {
            totalTime += A[i][1];
        }
        
       
        long[] posA = new long[totalTime + 1];
        long[] posB = new long[totalTime + 1];
        
        int timeIndex = 1;
        for (int i = 0; i < N; i++) {
            int v = A[i][0];
            int t = A[i][1];
            for (int j = 0; j < t; j++) {
                posA[timeIndex] = posA[timeIndex - 1] + v;
                timeIndex++;
            }
        }
        
        timeIndex = 1;
        for (int i = 0; i < M; i++) {
            int v = B[i][0];
            int t = B[i][1];
            for (int j = 0; j < t; j++) {
                posB[timeIndex] = posB[timeIndex - 1] + v;
                timeIndex++;
            }
        }
        
        
        int changes = 0;
        int leader = 0;
        
        for (int i = 1; i <= totalTime; i++) {
            int newLeader;
            if (posA[i] > posB[i]) newLeader = 1;
            else if (posA[i] < posB[i]) newLeader = -1;
            else newLeader = leader;
            
            if (leader != newLeader && leader != 0) changes++;
            leader = newLeader;
        }
        
        System.out.println(changes);
        
        br.close();
    }
}