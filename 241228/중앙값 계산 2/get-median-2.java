import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                Arrays.sort(arr, 0, i + 1);
                System.out.print(arr[i / 2] + " ");
            }
        }

        sc.close();
    }
}

/*
* (1) n개의 숫자가 주어졌을 때, 순서대로 숫자를 읽다가 홀수 번째의 원소가 주어질 때마다
* (2) 지금까지 입력받은 값의 중앙값을 출력하는 프로그램 작성
* (3) 중앙값이란 어떤 주어진 값들을 오름차순으로 정렬했을 때 가장 중앙에 위치하는 값을 의미
*/