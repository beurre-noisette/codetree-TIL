import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        sc.close();
    }
}

/*
* (1) n개의 원소가 주어졌을 때 처음에는 오름차순으로 정렬하여 출력
* (2) 그 다음에는 내림차순으로 정렬하여 출력
*/