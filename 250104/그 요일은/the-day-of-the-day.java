import java.util.Scanner;
import java.util.HashMap;

public class Main {
    static int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        String day = sc.next();
        
        HashMap<String, Integer> dayToNum = new HashMap<>();
        dayToNum.put("Mon", 1);
        dayToNum.put("Tue", 2);
        dayToNum.put("Wed", 3);
        dayToNum.put("Thu", 4);
        dayToNum.put("Fri", 5);
        dayToNum.put("Sat", 6);
        dayToNum.put("Sun", 7);
        
        int targetDay = dayToNum.get(day);
        int result = countDays(m1, d1, m2, d2, targetDay);
        System.out.println(result);
    }
    
    public static int countDays(int m1, int d1, int m2, int d2, int targetDay) {
        int totalDays = 0;
        int count = 0;
        
        if (m1 == m2) {
            for (int i = d1; i <= d2; i++) {
                if ((totalDays + 1) % 7 == targetDay % 7) {
                    count++;
                }
                totalDays++;
            }
            return count;
        }
        
        for (int i = d1; i <= daysInMonth[m1]; i++) {
            if ((totalDays + 1) % 7 == targetDay % 7) {
                count++;
            }
            totalDays++;
        }
        
        for (int month = m1 + 1; month < m2; month++) {
            for (int day = 1; day <= daysInMonth[month]; day++) {
                if ((totalDays + 1) % 7 == targetDay % 7) {
                    count++;
                }
                totalDays++;
            }
        }
        
        for (int i = 1; i <= d2; i++) {
            if ((totalDays + 1) % 7 == targetDay % 7) {
                count++;
            }
            totalDays++;
        }
        
        return count;
    }
}