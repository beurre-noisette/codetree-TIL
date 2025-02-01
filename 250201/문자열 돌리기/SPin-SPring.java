import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        solution(str);
    }

    public static void solution(String str) {
        String temp = str;
        int len = str.length();

        do {
            System.out.println(str);
            str = str.substring(len - 1, len) + str.substring(0, len - 1);
        } while (!str.equals(temp));

        System.out.println(str);
    }
}