import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cntArr = new int[1001]; // 중복되는 수를 카운트 할 배열

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cntArr[arr[i]]++;
        }

        int maxVal = -1;

        for (int i = 1; i <= 1000; i++) {
            if (cntArr[i] == 1) {
                maxVal = i;
            }
        }

        System.out.print(maxVal);

        sc.close();
    }
}