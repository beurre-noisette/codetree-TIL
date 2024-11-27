import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();

            if (n[i] == 0) {
                for (int j = i - 1; j >= 0; j--) {
                    System.out.print(n[j] + " ");
                }
                return;
            }
        }

        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }

        sc.close();
    }
}