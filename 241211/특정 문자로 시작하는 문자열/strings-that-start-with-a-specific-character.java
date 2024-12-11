import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);

        int cnt = 0;
        int allLen = 0;

        for (String s : arr) {
            if (s.charAt(0) == c) {
                cnt++;
                allLen += s.length();
            }
        }

        double avg = (double) allLen / cnt;

        System.out.println(cnt + " " + String.format("%.2f", avg));

        sc.close();
    }
}

/*
* 알파벳 소문자로 이루어진 n개의 문자열 입력
* 알파벳 한 개를 주고 해당 알파벳으로 시작하는 문자열의 개수와
* 그 문자열들의 길이의 평균을 구하시오
*/