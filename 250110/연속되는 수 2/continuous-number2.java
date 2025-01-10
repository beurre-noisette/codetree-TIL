import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int maxCnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                cnt++;
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                }
            }
        }

        System.out.println(maxCnt);

        sc.close();
    }
}

/*
(1) N개의 숫자들이 주어졌을 때, 연속하여 동일한 숫자가 나오는 횟수 중 최대를 구하시오
*/