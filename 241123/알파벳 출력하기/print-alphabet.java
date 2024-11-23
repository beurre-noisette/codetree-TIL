import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int asciiConverter = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (asciiConverter + 64));
                asciiConverter++;
                if (asciiConverter > 26) {
                    asciiConverter = 1;
                }
            }
            System.out.println();
        }

        sc.close();

    }
}