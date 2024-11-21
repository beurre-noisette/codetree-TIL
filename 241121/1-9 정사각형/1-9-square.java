import java.util.Scanner;

public class Main {
    static final int MAX_NUM = 9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 1;
        

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (cnt == MAX_NUM) {
                    System.out.print(cnt);
                    cnt = 1;
                } else {
                    System.out.print(cnt);
                    cnt ++;
                }
            }
            System.out.println();
        }
    }
}