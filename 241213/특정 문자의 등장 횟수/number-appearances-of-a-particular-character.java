import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int cntEe = 0;
        int cntEb = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'e') {
                cntEe++;
            }

            if (str.charAt(i) == 'e' && str.charAt(i + 1) == 'b') {
                cntEb++;
            }
        }

        System.out.print(cntEe + " " + cntEb);

        sc.close();
    }
}