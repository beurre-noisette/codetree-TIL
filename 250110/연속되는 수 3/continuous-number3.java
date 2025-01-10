import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 1;
        int maxCnt = 1;

        for (int i = 1; i < n; i++) {
            if ((arr[i] > 0 && arr[i-1] > 0) || (arr[i] < 0 && arr[i-1] < 0)) {
                cnt++;
                maxCnt = Math.max(maxCnt, cnt);
            } else {
                cnt = 1;
            }
        }

        System.out.println(maxCnt);
        sc.close();
    }
}

/*
(1) 0이 아닌 N개의 숫자들이 주어졌을 때
(2) 부호가 동일한 숫자로만 이루어진 연속 부분 수열 중 최대 길이를 구하시오
*/