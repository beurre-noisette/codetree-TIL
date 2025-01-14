import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] robotA = new int[n][2];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            robotA[i][0] = Integer.parseInt(st.nextToken());
            robotA[i][1] = st.nextToken().equals("R") ? 1 : -1;
        }
        
        int[][] robotB = new int[m][2];
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            robotB[i][0] = Integer.parseInt(st.nextToken());
            robotB[i][1] = st.nextToken().equals("R") ? 1 : -1;
        }
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


테스트케이스


결과


코드 실행


제출 및 채점




        int totalTimeA = 0;
        int totalTimeB = 0;
        for(int i = 0; i < n; i++) totalTimeA += robotA[i][0];
        for(int i = 0; i < m; i++) totalTimeB += robotB[i][0];
        
        int maxTime = Math.max(totalTimeA, totalTimeB);
        int[] posA = new int[maxTime + 1];
        int[] posB = new int[maxTime + 1];
        
        int currentPos = 0;
        int timeIndex = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < robotA[i][0]; j++) {
                currentPos += robotA[i][1];
                posA[timeIndex++] = currentPos;
            }
        }
        while(timeIndex <= maxTime) {
            posA[timeIndex++] = currentPos;
        }
        
        currentPos = 0;
        timeIndex = 1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < robotB[i][0]; j++) {
                currentPos += robotB[i][1];
                posB[timeIndex++] = currentPos;
            }
        }
        while(timeIndex <= maxTime) {
            posB[timeIndex++] = currentPos;
        }
        
        int answer = 0;
        for(int i = 1; i < maxTime; i++) {
            if(posA[i] != posB[i] && posA[i+1] == posB[i+1]) {
                answer++;
            }
        }
        
        System.out.println(answer);
    }
}