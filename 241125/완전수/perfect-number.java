import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();
        int perfectNumber = 0;

        for (int i = start; i <= end; i++) {
            int sum = 0;

            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }

            if (sum == i) {
                perfectNumber++;
            }
        }

        System.out.print(perfectNumber);

        sc.close();
    }

}

/**
* n의 진약수 = n을 나누어 떨어지게 하는 '양의 정수' 중 n이 아닌 수를 의미한다.
* n의 진약수의 총합이 n과 같다면 n은 '완전수'라고 부른다.
*/