import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int idx = sc.nextInt();

        if (idx > str.length()) {
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        } else {
            for (int i = str.length() - 1; i >= str.length() - idx; i--) {
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}