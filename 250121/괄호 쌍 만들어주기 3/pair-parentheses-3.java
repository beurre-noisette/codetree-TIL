import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String parentheses = sc.next();

        int cnt = 0;

        for (int i = 0; i < parentheses.length(); i++) {
            if (parentheses.charAt(i) == '(') {
                for (int j = i + 1; j < parentheses.length(); j++) {
                    if (parentheses.charAt(j) == ')') {
                        cnt++;
                    }
                }
            }
        }

        System.out.print(cnt);

        sc.close();
    }
}

/*
(1) 문자 '(',')'로만 이루어진 문자열 A가 주어지면
(2) 그 문자열들 사이에서 여는 괄호와 닫는 괄호로 쌍을 이룰 수 있는 서로 다른 가지수를
(3) 구하는 프로그램을 작성하시오. 단 여는 괄호가 먼저 나와야 합니다.
*/