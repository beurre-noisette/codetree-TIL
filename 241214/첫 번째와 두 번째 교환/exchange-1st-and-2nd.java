import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str.charAt(0)) {
                arr[i] = str.charAt(1);
            } else if (arr[i] == str.charAt(1)) {
                arr[i] = str.charAt(0);
            }
        }

        str = String.valueOf(arr);

        System.out.print(str);

        sc.close();
    }
}

/*
* (1) 문자열 1개(소문자 알파벳) 제공
* (2) 첫 번째 문자와 같은 문자는 모두 두 번째 문자로 바꾸고
* (3) 두 번째 문자와 같은 문자는 모두 첫 번째 문자로 바꾼다
*/