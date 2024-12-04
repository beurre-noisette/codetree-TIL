import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < minValue) {
                minValue = arr[i + 1] - arr[i];
            }
        }

        System.out.print(minValue);

        sc.close();
    }
}

/*
 * (1) n개의 숫자가 오름차순으로 주어짐
 * (2) 서로 다른 두 개의 숫자를 골랐을 때, 두 숫자의 차가 최소가 되는 경우, 그 차이를 구해야 함
 */