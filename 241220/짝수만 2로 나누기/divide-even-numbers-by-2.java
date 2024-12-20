import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        modify(arr.clone());

        sc.close();
    }

    private static void modify(int[] arr) {
        for (int e : arr) {
            if (e % 2 == 0) {
                System.out.print(e / 2 + " ");
            } else {
                System.out.print(e + " ");
            }
        }
    }
}