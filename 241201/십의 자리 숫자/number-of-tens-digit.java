import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int[] cntTens = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            cntTens[arr[i] % 100 / 10]++;
        }

        for (int i = 1; i < cntTens.length; i++) {
            System.out.println(i + " - " + cntTens[i]);
        }

    }
}

/**
* 0이 주어지면, '0을 제외하고' 그 때 까지 입력된 정수의 숫자들의 '십의 자리 숫자가 각각 몇개인지' '작은수 부터 출력'
*/