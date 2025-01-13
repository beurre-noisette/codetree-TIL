import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] students = new int[n + 1];
        int m = sc.nextInt();
        int k = sc.nextInt();

        int target = -1;

        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            students[num]++;

            if (students[num] >= k) {
                target = num;
                break;
            }
        }

        System.out.print(target);

        sc.close();
    }
}

/*
(1) 학생 N명, 1번부터 N번까지 번호가 붙여져 있음 (배열로 처리)
(2) 한 학생이 K번 이상 벌칙을 받게 되면 벌금을 내야함
(3) M번에 걸쳐 벌칙에 걸린 학생의 번호가 순서대로 주어짐
(4) 최초로 벌금을 내는 학생이 누구인지 알아내는 프로그램 작성
(R) 1 <= N <= 100 | 1 <= K, M <= 10_000 | 1 <= 학생의 번호 <= N
*/