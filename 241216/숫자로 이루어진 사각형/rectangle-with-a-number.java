import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printSquare(n);

        sc.close();
    }

    private static void printSquare(int n) {
        int cnt = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (cnt != 10) {
                    System.out.print(cnt + " ");
                    cnt++;
                } else {
                    System.out.print(1 + " ");
                    cnt = 2;
                }
            }
            System.out.println();
        }
    }
}