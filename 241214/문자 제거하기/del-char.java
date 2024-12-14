import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());

        while (sb.length() > 1) {
            int idx = sc.nextInt();

            if (idx >= sb.length()) {
                sb.deleteCharAt(sb.length() - 1);
                System.out.println(sb);
            } else {
                sb.deleteCharAt(idx);
                System.out.println(sb);
            }
        }

        sc.close();
    }
}