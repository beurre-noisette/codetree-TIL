import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int startNum = 11;
        int addNum = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(startNum + addNum + " ");
                addNum += 2;

                if (j == n) {
                    addNum = 0;
                    startNum += 2;
                }
            }
            System.out.println();
        }
    }
}