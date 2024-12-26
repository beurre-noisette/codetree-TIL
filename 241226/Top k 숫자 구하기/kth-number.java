import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print(arr[k - 1]);
        
        sc.close();
    }
}

/*
* (1) n개의 숫자가 주어졌을 때
* (2) 오름차순으로 정렬했을 때 k번째 숫자를 출력
*/