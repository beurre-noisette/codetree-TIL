import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] people = new int[n];

        for (int i = 0; i < n; i++) {
            people[i] = sc.nextInt();
        }

        long minSum = Long.MAX_VALUE;

        for (int meet = 0; meet < n; meet++) {
            long sum = 0;

            for (int i = 0; i < n; i++) {
                sum += (long)Math.abs(meet - i) * people[i];
            }

            minSum = Math.min(minSum, sum);
        }

        System.out.print(minSum);

        sc.close();
    }
}

/*
(1) n개의 집이 x = 1에서 x = n 까지 순서대로 놓여있고
(2) 각각 Ai 명의 사람들이 살고 있다.
(3) 이들은 회의를 위해 n개의 집 중 한 곳에 전부 모이려고 한다. (이런게 완전탐색인듯?)
(4) 모든 사람들의 이동거리의 합이 최소가 되도록 하는 프로그램을 작성하시오.

(R) 1 <= n <= 100 | 1 <= Ai <= 100
*/