import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] A = new int[N][2];
        int[][] B = new int[M][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            A[i][0] = Integer.parseInt(st.nextToken());
            A[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            B[i][0] = Integer.parseInt(st.nextToken());
            B[i][1] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(N, M, A, B));
    }

    private static int solution(int N, int M, int[][] A, int[][] B) {
        int totalTime = 0;
        for (int[] move : A) {
            totalTime += move[1];
        }

        long[] posA = new long[totalTime + 1];
        long[] posB = new long[totalTime + 1];

        int timeA = 0;
        for (int[] move : A) {
            int v = move[0], t = move[1];
            for (int i = 1; i <= t; i++) {
                posA[timeA + i] = posA[timeA] + (long)v * i;
            }
            timeA += t;
        }

        int timeB = 0;
        for (int[] move : B) {
            int v = move[0], t = move[1];
            for (int i = 1; i <= t; i++) {
                posB[timeB + i] = posB[timeB] + (long)v * i;
            }
            timeB += t;
        }

        int changes = 0;
        String prev = "";

        for (int i = 1; i <= totalTime; i++) {
            String current;
            if (posA[i] > posB[i]) {
                current = "A";
            } else if (posA[i] < posB[i]) {
                current = "B";
            } else {
                current = "AB";
            }

            if (!current.equals(prev)) {
                changes++;
                prev = current;
            }
        }

        return changes;
    }
}