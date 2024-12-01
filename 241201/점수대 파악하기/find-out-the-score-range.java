import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] students = new int[100]; // 100명 이하의 학생들의 점수가 주어질 배열
        int[] cntTens = new int[11]; // 1 ~ 10 까지 사용해야 함

        for (int i = 0; i < students.length; i++) {
            students[i] = sc.nextInt();

            if (students[i] == 0) {
                break; // 0점이 입력되면 반복문 종료
            }

            if (students[i] < 10) {
                continue; // 10점 미만의 학생들은 무시하고 지나감
            }

            cntTens[students[i] / 10]++;
        }

        for (int i = cntTens.length - 1; i >= 1; i--) {
            System.out.println((i * 10) + " - " + cntTens[i]);
        }

        sc.close();
    }
}