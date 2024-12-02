import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        StringBuilder arrA = new StringBuilder();
        StringBuilder arrB = new StringBuilder();
        String result = null;

        for (int i = 0; i < n1; i++) {
            arrA.append(sc.next());
        }

        for (int i = 0; i < n2; i++) {
            arrB.append(sc.next());
        }
    
        while (true) {
            if (arrA.charAt(0) != arrB.charAt(0)) {
                arrA.deleteCharAt(0);
            } else {
                break;
            }
        }

        for (int i = 0; i < arrB.length(); i++) {
            if (arrA.charAt(i) == arrB.charAt(i)) {
                result = "Yes";
            } else {
                result = "No";
                break;
            }
        }

        System.out.println(result);

        sc.close();
    }
}

/*
* 수열 A는 n1개의 원소로 이루어져 있고 수열 B는 n2개의 원소로 이루어져 있을 때 수열 B는 수열 A의 '연속부분수열'인지 판단하시오.
* 연속부분수열이란 수열 B가 수열 A의 원소들을 연속하게 뽑았을 때 나올 수 있는 수열을 의미합니다.
*/