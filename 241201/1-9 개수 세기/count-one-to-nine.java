import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] cntArr = new int[10]; // 주어지는 숫자가 1 <= x <= 9 이므로

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            cntArr[arr[i]]++;
        }

        for (int i = 1; i < cntArr.length; i++) {
            System.out.println(cntArr[i]);
        }

        sc.close();
    }
}