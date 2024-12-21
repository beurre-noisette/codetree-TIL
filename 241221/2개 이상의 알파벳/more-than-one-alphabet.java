import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(hasAnotherTwo(str)? "Yes" : "No");

        sc.close();
    }

    private static boolean hasAnotherTwo(String s) {
        int cnt = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (cnt >= 2) {
                return true;
            }

            if (s.charAt(i) != s.charAt(i + 1)) {
                cnt++;
            }
        }

        return false;
    }
}

/*
* (1) 소문자 알파벳으로 이루어진 String a
* (2) a를 이루고 있는 서로 다른 알파벳의 수가 2개 이상인지 판단
* (3) 함수를 사용할 것
*/