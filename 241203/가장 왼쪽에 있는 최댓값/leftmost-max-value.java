import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int finishSearch = arr.length;
        boolean isRun = true;

        while (isRun) {
            int maxVal = 0;
            int maxIdx = 0;

            for (int i = 0; i < finishSearch; i++) {
                if (maxVal < arr[i]) {
                    maxVal = arr[i];
                    maxIdx = i;
                }
            }

            if (maxVal == arr[0]) {
                System.out.print(1);
                break;
            }

            System.out.print(maxIdx + 1 + " ");

            finishSearch = maxIdx;

        }

        sc.close();
    }
}

/*
* (1) 제공되는 N개의 숫자 중 최댓값의 '위치'를 출력해야 함.
*     최댓값이 여러 개라면 가장 왼쪽에 있는 최댓값의 위치를 출력. -> 주어진 숫자의 위치를 변경하지 말라는 뜻
* (2) (1)에서 구한 최댓값의 위치보다 더 왼쪽에 있는 숫자들 중 최댓값의 위치를 출력함
*     마찬가지로 최댓값이 여러개라면 가장 왼쪽에 있는 최댓값의 위치를 출력
* (3) 이런식으로 쭉 반복하다가, 첫 번째 원소가 뽑히게 되면 프로그램을 종료
*/