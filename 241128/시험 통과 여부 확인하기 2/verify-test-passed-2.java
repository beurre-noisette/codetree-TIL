import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int[][] grades = new int[students][4];
        int totalScore = 0;
        int passedStudents = 0;

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 4; j++) {
                grades[i][j] = sc.nextInt();
            }

            for (int j = 0; j < 4; j++) {
                totalScore += grades[i][j];
            }

            if (totalScore / 4 >= 60) {
                passedStudents++;
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }

            totalScore = 0;
        }

        System.out.println(passedStudents);

        sc.close();
    }
}