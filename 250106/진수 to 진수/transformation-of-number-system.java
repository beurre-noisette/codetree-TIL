import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next(); // n은 a진수

        int parseN = Integer.parseInt(n, a);

        String parseNtoB = Integer.toString(parseN, b);

        System.out.println(parseNtoB);

        sc.close();
    }
}

/*
(1) a, b가 주어지고 a진수로 표현된 n이 주어지면
(2) n을 b진수로 변환하여 출력
*/