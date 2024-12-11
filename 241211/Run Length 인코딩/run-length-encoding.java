import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        StringBuilder sb = new StringBuilder();

        char c = str.charAt(0);
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                cnt++;
            } else {
                sb.append(c);
                sb.append(cnt);
                c = str.charAt(i);
                cnt = 1;
            }
        }

        sb.append(c);
        sb.append(cnt);

        System.out.println(sb.length());
        System.out.println(sb);

        sc.close();
    }
}