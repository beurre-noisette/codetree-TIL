import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[200];
        int cnt = 0;

        for (int i = 0; true; i++) {
            String str = sc.next();
            strArr[i] = str;

            if (str.equals("0")) {
                break;
            }
            cnt++;
        }

        System.out.println(cnt);

        for (int i = 0; i < cnt; i++) {
            if (i % 2 == 0) { 
                System.out.println(strArr[i]);
            }
        }

    }
}
