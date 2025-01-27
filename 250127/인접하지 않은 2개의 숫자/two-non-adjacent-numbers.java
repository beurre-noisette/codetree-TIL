import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n; j++) {
                int currentSum = arr[i] + arr[j];

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        System.out.print(maxSum);

        sc.close();
    }
}