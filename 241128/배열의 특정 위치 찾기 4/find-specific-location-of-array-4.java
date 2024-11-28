import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                System.out.print(cnt + " " + sum);
                return;
            } else if (arr[i] % 2 == 0) {
                cnt++;
                sum += arr[i];
            }
        }

        System.out.print(cnt + " " + sum);

        sc.close();
    }
}
