import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] grades = new double[8];
        double sum = 0;
        double avg = 0;

        for (int i = 0; i < grades.length; i++) {
            grades[i] = sc.nextDouble();
            sum += grades[i];
        }

        avg = Math.round(sum / grades.length * 10.0) / 10.0;

        System.out.print(avg);

        sc.close();
    }
}