import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            for (int space = 0; space < i; space++) {
                System.out.print("  ");
            }

            for (int j = n - i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}