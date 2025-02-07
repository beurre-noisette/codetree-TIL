import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));

    }

    public static int solution(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        int num1 = 0, num2 = 0;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (char c : arr1) {
            if (Character.isDigit(c)) {
                sb1.append(c);
            } else if (!Character.isDigit(c)) {
                break;
            }
        }

        for (char c : arr2) {
            if (Character.isDigit(c)) {
                sb2.append(c);
            } else if (!Character.isDigit(c)) {
                break;
            }
        }

        num1 = Integer.parseInt(sb1.toString());
        num2 = Integer.parseInt(sb2.toString());

        return num1 + num2;
    }

}