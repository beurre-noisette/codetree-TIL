import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0) {
                System.out.print(sum + " " + avg);
                return;
            } else {
                sum += arr[i];
                avg = Math.round((double) sum / (i + 1) * 10) / 10.0;
            }
        }

        System.out.print(sum + " " + avg);

        sc.close();
    }
}