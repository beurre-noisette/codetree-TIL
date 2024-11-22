import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sumNum = 2;

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= (b - a + 1); j++) {
                System.out.print((b - j + 1) + " * " + sumNum + " = " + ((b - j + 1) * sumNum));
                if (j < (b - a + 1)) {
                    System.out.print(" / ");
                }
            }
            sumNum += 2;
            System.out.println();
        }

        sc.close();
    }
}