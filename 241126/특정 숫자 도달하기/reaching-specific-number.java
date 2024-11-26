import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int sum = 0;
        int count = 10;

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();

            if (numbers[i] >= 250) {
                sum = 0;
                count = i;

                for (int j = 0; j < i; j++) {
                    sum += numbers[j];
                }
                break;
            }

            sum += numbers[i];
        }

        double avg = Math.round((double) sum / count * 10) / 10.0;

        System.out.print(sum + " " + avg);

        sc.close();
    }
}