import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (str == null || str.length() <= 1) {
            System.out.println(str);
            return;
        }

        String result = str.substring(1) + str.charAt(0);
        System.out.println(result);

        sc.close();
    }
}