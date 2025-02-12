import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String a = sc.next();
        String[] strArr = new String[n];

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }

        int cnt = 0;

        for (String str : strArr) {
            if (str.equals(a)) {
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}