import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static String originStr = sc.next();
    public static String targetStr = sc.next();

    public static void main(String[] args) {
        System.out.print(startIdx());

        sc.close();
    }

    private static int startIdx() {
        return originStr.indexOf(targetStr);
    }
}

/*
* (1) 목적 문자열이 부분 문자열로 존재하는 경우, 부분 문자열의 시작 인덱스를 ㅊ ㅜㄹ력
* (2) 메서드를 이용하여 풀이
*/