import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > 11 || (a == 11 && (b > 11 || (b == 11 && c >= 11)))) {
            int daysToMin = (a - 11) * 24 * 60;
            int timeToMin = b * 60;
            System.out.print(daysToMin + timeToMin + c - (11 * 60 + 11));
        } else {
            System.out.print("-1");
        }

        sc.close();
    }
}
/*
(1) 2011-11-11 11:11 부터 2011-11-a b:c 까지 몇 분 걸림?
*/