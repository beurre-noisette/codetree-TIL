import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        System.out.print(isLeapYear(year));

        sc.close();
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 400 != 0 && year % 100 == 0) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}