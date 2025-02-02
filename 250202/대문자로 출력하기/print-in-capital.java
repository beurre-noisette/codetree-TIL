import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        System.out.print(solution(str));
    }

    public static StringBuilder solution(String str) {
        char[] arr = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i])) {
                sb.append(Character.toUpperCase(arr[i]));
            }
        }

        return sb;
    }
}
