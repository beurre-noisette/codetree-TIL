import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + (2 * arr[i - 2]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

/**
* A1과 A2가 주어졌을 때, A10까지 구하는 프로그램 만들기
* An = An-1 + 2An-2, 단 3번째 항부터
*/