import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        arr2[0] = arr1[0];
        arr2[1] = arr1[1];

        str2 = String.valueOf(arr2);

        System.out.print(str2);

        sc.close();
    }
}

/*
* (1) 첫 번째 문자열의 앞부분 두 글자를 복사해 두 번째 문자열의 앞부분 두글자로 교체
* (2) 두번쨰 문자열만 출력
*/