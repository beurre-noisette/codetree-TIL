import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        
        for (int i = 1; i <= m; i++) {
            int n = sc.nextInt();
            int count = 0;

            while (n != 1) {
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = n * 3 + 1;
                }
                count++;
            }

            System.out.println(count);
        }

        sc.close();
    }
}