import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.print(Arrays.equals(arr1, arr2)? "Yes" : "No");

        sc.close();
    }
}

/*
* (1) 두 개의 단어가 입력으로 주어질 때 두 단어에 속하는 문자들의 순서를 바꾸어 동일한 단어로 만들 수 있는지 여부를 출력
*/