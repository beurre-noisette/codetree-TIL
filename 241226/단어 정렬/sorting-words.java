import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.println(s);
        }

        sc.close();
    }
}

/*
* (1) 소문자 알파벳으로만 이루어진 단어 n개가 주어졌을 때
* (2) 사전순으로 앞선 알파벳이 더 먼저 나오도록 정렬하여 출력
*/