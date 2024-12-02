import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arrA = new int[n1];
        int[] arrB = new int[n2];

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = sc.nextInt();
        }

        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i <= n1 - n2; i++) {
            boolean match = true;

            for (int j = 0; j < n2; j++) {
                if (arrA[i + j] != arrB[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                found = true;
                break;
            }
        }

        System.out.println(found ? "Yes" : "No");

        sc.close();
    }
}

/*
* 수열 A는 n1개의 원소로 이루어져 있고 수열 B는 n2개의 원소로 이루어져 있을 때 수열 B는 수열 A의 '연속부분수열'인지 판단하시오.
* 연속부분수열이란 수열 B가 수열 A의 원소들을 연속하게 뽑았을 때 나올 수 있는 수열을 의미합니다.
*/