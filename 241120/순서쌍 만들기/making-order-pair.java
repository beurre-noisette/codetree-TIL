import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int targetNum = sc.nextInt();

        for (int i = targetNum; i >= 1; i--) {
            for (int j = targetNum; j >= 1; j--) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}