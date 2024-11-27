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

        avg = sum / grades.length;

        System.out.print(avg);

        sc.close();
    }
}