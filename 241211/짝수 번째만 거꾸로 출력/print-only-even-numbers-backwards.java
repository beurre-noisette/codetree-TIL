import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < str.length(); i+=2) {
            sb.append(str.charAt(i));
        }

        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            System.out.print(sb.charAt(i));
        }

        sc.close();
    }
}