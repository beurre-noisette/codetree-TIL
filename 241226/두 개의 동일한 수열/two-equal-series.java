import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        if (Arrays.equals(arrA, arrB)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}

/*
* (1) n개의 원소로 이루어진 수열 A와 n개의 원소로 이루어진 수열 B
* (2) 두 수열이 서로 같은 원소들로 이루어져 있는지를 판별하는 프로그램 작성
*/