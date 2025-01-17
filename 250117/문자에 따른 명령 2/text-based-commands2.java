import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String commands = sc.next();

        int x = 0, y = 0;
        int dirNum = 0;

        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (char command : commands.toCharArray()) {
            if (command == 'L') {
                dirNum = (dirNum - 1 + 4) % 4;
            } else if (command == 'R') {
                dirNum = (dirNum + 1) % 4;
            } else {
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }

        System.out.print(x + " " + y);

        sc.close();
    }
}

/*
(0,0)에서 북쪽을 향한 상태로 움직이기를 시작함
N개의 명령에 따라 총 N번 움직이고 
L이 주어지면 반시계로 90' 전환, R이 주어지면 시계로 90' 전환, F가 주어지면 현 방향으로 한 칸 이동
*/