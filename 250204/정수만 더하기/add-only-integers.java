import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(solution(str));
    }

    public static int solution(String str) {
        char[] arr = str.toCharArray();

        int result = 0;

        for (char c : arr) {
            if (Character.isDigit(c)) {
                result += Character.getNumericValue(c);
            }
        }

        return result;
    }
}