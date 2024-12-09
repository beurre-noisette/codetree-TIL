import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        char chr1 = sc.next().charAt(0);
        int cnt = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == chr1) {
                cnt++;
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}