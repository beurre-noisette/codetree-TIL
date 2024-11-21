import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int count = 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(i * count + " ");
                count++;
                if (j == col) {
                    count = 1;
                }
            }
            System.out.println();
        }
    }
}