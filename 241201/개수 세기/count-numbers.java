import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 수가 주어지는 개수
        int m = sc.nextInt(); // cnt할 수
        int[] arr = new int[n];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == m) {
                cnt++;
            }
        }

        System.out.print(m);

        sc.close();
    }
}