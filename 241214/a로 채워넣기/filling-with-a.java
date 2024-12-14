import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] arr = str.toCharArray();

        arr[1] = 'a';
        arr[arr.length - 2] = 'a';

        str = String.valueOf(arr);

        System.out.print(str);

        sc.close();
    }
}

/*
* 앞에서 2번째 원소(index = 1), 뒤에서 두번째 원소(str.length() - 1)
* 를 'a'로 대체
*/