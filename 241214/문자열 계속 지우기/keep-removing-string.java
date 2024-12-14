import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder(sc.next());
        String str = sc.next();

        while (true) {
            int idx = sb.indexOf(str);
            if (idx == -1) {
                break;
            }

            sb.delete(idx, idx + str.length());
        }

        System.out.print(sb.toString());

        sc.close();
    }
}