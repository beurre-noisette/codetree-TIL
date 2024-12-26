import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        String sortedStr = new String(arr);

        for (int i = 0; i < sortedStr.length(); i++) {
            System.out.print(sortedStr.charAt(i));
        }

        sc.close();
    }
}

/*
* (1) 소문자 알파벳으로만 이루어진 문자열 제공
* (2) 알파벳이 앞선 것이 더 먼저 나오도록 정렬하여 출력
*/