import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0; 
        int maxCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > t) {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            } else {
                cnt = 0;
            }
        }

        System.out.print(maxCnt);

        sc.close();
    }
}

/*
(1) t보다 큰 수로만 이루어진 연속 부분 수열 중 최대 길이를 구하시오
*/