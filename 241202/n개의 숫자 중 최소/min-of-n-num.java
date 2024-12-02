import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int minVal = arr[0];
        int cnt = 0;

        for (int i = 1; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == minVal) {
                cnt++;
            }
        }

        System.out.print(minVal + " " + cnt);

        sc.close();
    }
}