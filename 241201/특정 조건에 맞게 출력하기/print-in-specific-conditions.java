import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] % 2 == 1) {
                        System.out.print(arr[j] + 3 + " ");
                    } else {
                        System.out.print(arr[j] / 2 + " ");
                    }
                }

                break;
            }
        }

        sc.close();
    }
}

/**
* 0 <= 주어지는 정수 <= 100
* 0이 주어지면 0을 제외하고 그때까지 주어진 정수를 차례로 출력하되,
* 그 수가 홀수이면 3을 더한 값 출력 | 그 수가 짝수이면 2로 나눈 몫을 출력
*/