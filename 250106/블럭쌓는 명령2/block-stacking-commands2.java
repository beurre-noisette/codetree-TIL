import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 전체 칸 수
        int k = sc.nextInt(); // 명령의 수

        int[] blocks = new int[n];

        for (int i = 0; i < k; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            if (a >= 0 && b < n) {
                for (int j = a; j <= b; j++) {
                    blocks[j]++;
                }
            }
        }

        Arrays.stream(blocks).max().ifPresent(System.out::println);

        sc.close();
    }
}

/*
(1) 1번 칸부터 N번째 칸까지 순서대로 총 N개의 칸이 있다.
(2) 이중 Ai 번째 칸부터 Bi 번째 칸까지 각각 블럭을 1개씩 쌓으라는 명령이 총 K번 주어진다.
(3) 명령을 다 수행한 이후 1번째 칸부터 N번째 칸까지 쌓인 블럭의 수 중 최댓값을 출력하시오.
*/