import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] heights = new int[N];
        
        for(int i = 0; i < N; i++) {
            heights[i] = sc.nextInt();
        }
        
        int count = 0;
        for(int i = 0; i < N-2; i++) {
            for(int j = i+1; j < N-1; j++) {
                for(int k = j+1; k < N; k++) {
                    if(heights[i] <= heights[j] && heights[j] <= heights[k]) {
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}

/*
(1) N마리의 소가 x = 1 부터 x = N까지 순서대로 서 있다.
(2) 각 소의 키는 Ai이며, 예를 들어 첫 번째 위치에 놓여있는 소의 키는 A1이다.
(3) 3마리의 서로 다른 소의 위치를 (i, j, k)라고 했을 때
(4) i < j < k를 만족하며 동시에 Ai <= Aj <= Ak 를 만족하는 서로 다른 쌍의 수를 구하는 프로그램을 구하시오.
*/