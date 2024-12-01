import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] cntRemain = new int[10]; // 0 ~ 9 까지 cnt할 배열
        int result = 0;

        while (true) {
            if (a <= 1) {
                break;
            }

            int quotient = a / b;
            int remainder = a % b;

            cntRemain[remainder]++;

            a = quotient;

        }

        for (int i = 0; i < cntRemain.length; i++) {
            result = result + (cntRemain[i] * cntRemain[i]);
        }

        System.out.print(result);

        sc.close();
    }
}

/**
* a = a / b;
* a가 1이하가 되기전까지 반복
* 각 나눗셈 연산마다 나온 나머지들이 등장한 횟수를 제곱하여 그 합을 출력
*/