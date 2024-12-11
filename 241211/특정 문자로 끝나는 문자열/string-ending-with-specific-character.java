import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        char c = sc.next().charAt(0);
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(arr[i].length() - 1) == c) {
                System.out.println(arr[i]);
                cnt++;
            }
        }

        if (cnt == 0) {
            System.out.println("None");
        }

        sc.close();
    }
}

/*
* 알파벳으로 이루어진 10개의 문자열 | 1개의 문자
* 해당 문자로 끝나는 문자열들을 한 줄에 하나씩 출력
* 매칭되는게 없다면 None을 출력
*/