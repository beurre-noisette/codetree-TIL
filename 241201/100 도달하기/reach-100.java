import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[30];
        int breakPoint = 0;

        arr[0] = 1;
        arr[1] = sc.nextInt();

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];

            if (arr[i] > 100) {
                breakPoint = i;
                break;
            }
        }

        for (int i = 0; i <= breakPoint; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

/**
* n이 주어지면, n을 두 번째 항으로 초기화
* 첫 번째 항은 1로 초기화
* 세 번째 항부터 전전항과 전항을 더한 수로 계속 채워나감 (100을 넘길 때 까지)
* 피보나시 수열의 개념을 약간 비튼 듯?
*/