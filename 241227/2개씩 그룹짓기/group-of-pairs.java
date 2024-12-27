import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 만들어야 하는 그룹의 수
        int[] arr = new int[2 * n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int sum = arr[i] + arr[2 * n - 1 - i];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);

        sc.close();
    }
}

/*
* (1) 2 * N개의 숫자가 주어졌을 때, 겹치지 않으면서 2개의 원소가 하나의 그룹을 이루도록 하여 총 N개의 그룹을 만드려고 한다.
* (2) 적절하게 그룹을 만들어 각 그룹에 있는 원소의 합 중 최댓값이 최소가 되도록 하는 프로그램을 작성
*/