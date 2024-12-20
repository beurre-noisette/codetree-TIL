import java.util.Scanner;

public class Main {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        abs(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    private static void abs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else if (0 - arr[i] > 0) {
                arr[i] *= -1;
            }
        }
    }
}

/*
* (1) int[] arr를 인자로 받아 각각 절댓값을 씌워주는 함수 작성 (void로 작성)
* (2) 함수 호출 후 각 원소의 값을 출력
*/