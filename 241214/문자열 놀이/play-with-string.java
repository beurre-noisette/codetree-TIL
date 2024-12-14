import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int q = sc.nextInt();
        char[] arr = s.toCharArray();

        for (int j = 0; j < q; j++) {
            int qNum = sc.nextInt();

            if (qNum == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                char temp = arr[b - 1];
                arr[b - 1] = arr[a - 1];
                arr[a - 1] = temp;

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            } else if (qNum == 2) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == a) {
                        arr[i] = b;
                    }
                }

                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            } else {
                System.out.println("Wrong input value.");
            }
        
        }

        sc.close();
    }
}

/*
* (1) 문자열 s와 q개의 질의가 주어짐
* (2) 1 a b | a번째 문자와 b번째 문자를 교환한 뒤 출력
* (3) 2 a b | 문자 a를 전부 문자 b로 변경한 뒤 출력
* (4) **문자열은 질의에 따라 계속 변합니다.**
*/