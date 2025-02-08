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

        int num1 = extractNumbers(arr1);
        int num2 = extractNumbers(arr2);

        return num1 + num2;
    }

    public static int extractNumbers(char[] arr) {
        StringBuilder sb = new StringBuilder();

        for (char c : arr) {
            if (Character.isDigit(c)) {
                sb.append(c);
            }
        }

        return Integer.parseInt(sb.toString());
    }

}