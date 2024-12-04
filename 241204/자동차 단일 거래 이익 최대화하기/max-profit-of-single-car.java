import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] - arr[j] < 0 && (arr[i] - arr[j]) * -1 > maxProfit) {
                    maxProfit = (arr[i] - arr[j]) * -1;
                }
            }
        }

        System.out.print(maxProfit);

        sc.close();
    }
}

/*
 * (1) 향후 n년 간의 자동차 가격 정보가 미리 주어졌음
 * (2) 자동차를 단 한 번 사서 되팔 때 이익을 최대화 하고 싶음
 * (3) 낼 수 있는 최대 이익을 출력하는 프로그램을 작성
 * (4) 단, 자동차를 사기 전에는 팔 수 없음
 */