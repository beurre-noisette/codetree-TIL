import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] grades = new double[n];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }

        avg = Math.round(sum / n * 10) / 10.0;

        if (avg >= 4.0) {
            System.out.print(avg + "\n" + "Perfect");
        } else if (avg >= 3.0) {
            System.out.print(avg + "\n" + "Good");
        } else {
            System.out.print(avg + "\n" + "Poor");
        }

        sc.close();
    }
}