import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            StringBuilder print = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    print.append(i + 1);
                } else {
                    print.append(n - i);
                }
            }

            System.out.println(print);
        }

        sc.close();
    }
}

/**
* 18181818
* 27272727
* 36363636
* 45454545
* 54545454
* 63636363
* 72727272
* 81818181
*/