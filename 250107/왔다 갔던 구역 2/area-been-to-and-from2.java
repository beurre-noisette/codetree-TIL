import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentPos = 500;
        int[] path = new int[1000];

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            int distance = Integer.parseInt(command[0]);
            char direction = command[1].charAt(0);

            if (direction == 'L') {
                for (int j = 1; j <= distance; j++) {
                    path[currentPos - j]++;
                }
                currentPos -= distance;
            } else {
                for (int j = 1; j <= distance; j++) {
                    path[currentPos + j]++;
                }
                currentPos += distance;
            }
        }

        int result = 0;
        for(int count : path) {
            if (count >= 2) { result ++; }
        }

        System.out.println(result);
        sc.close();
    }
}

/*
(1) 위치 0에서 시작하여 n번의 명령에 걸쳐 움직인 뒤,
(2) 2번 이상 지나간 영역의 크기를 출력하는 프로그램을 작성
(3) x L, x R 형태로 명령이 주어짐
(4) 1<= n <= 100 | 1 <= x <= 10
*/