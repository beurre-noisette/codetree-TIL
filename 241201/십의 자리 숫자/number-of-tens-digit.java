import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[99]; // 100개의 수를 받을 배열
        int[] cntTens = new int[10]; // 십의 자리인 1 ~ 9를 카운트 할 배열

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                break; // 해당 반복문을 종료
            }

            if (arr[i] < 10) {
                continue; // 입력받은 숫자가 한 자리수 일 경우 하위 코드를 실행하지 않을 것
            }

            cntTens[arr[i] / 10]++; // 입력받은 숫자의 10의 자리를 cntTens배열의 인덱스 값을 ++ 하는 것으로 계산
        }

        for (int i = 1; i < cntTens.length; i++) {
            System.out.println(i + " - " + cntTens[i]);
        }

        sc.close();

    }
}

/**
* 0이 주어지면, '0을 제외하고' 그 때 까지 입력된 정수의 숫자들의 '십의 자리 숫자가 각각 몇개인지' '작은수 부터 출력'
*/