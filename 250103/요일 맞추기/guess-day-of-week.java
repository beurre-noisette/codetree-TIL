import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        int[] daysOfMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int day1 = 0;
        for (int i = 1; i < m1; i++) {
            day1 += daysOfMonth[i];
        }
        day1 += d1;
        day1 %= 7;
        
        int day2 = 0;
        for (int i = 1; i < m2; i++) {
            day2 += daysOfMonth[i];
        }
        day2 += d2;
        
        int diff = day2 - day1;
        if (diff < 0) {
            diff += 7;
        }
        
        System.out.println(days[(diff + 1) % 7]);
        
        sc.close();
    }
}