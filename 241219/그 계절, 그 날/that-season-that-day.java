import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();

        System.out.print(getSeason(year, month, day));

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

    private static boolean isExist(int year, int month, int day) {
        if (year < 1 || year > 3000) { return false; }

        if (isLeapYear(year)) {
            if (month == 2) {
                return day >= 1 && day <= 29;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return day >= 1 && day <= 30;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return day >= 1 && day <= 31;
            } else {
                return false;
            }
        } else {
            if (month == 2) {
                return day >= 1 && day <= 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                return day >= 1 && day <= 30;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return day >= 1 && day <= 31;
            } else {
                return false;
            }
        }
    }

    private static String getSeason(int year, int month, int day) {
        if (isExist(year, month, day)) {
            if (month >= 3 && month <= 5) {
                return "Spring";
            } else if (month >= 6 && month <= 8) {
                return "Summer";
            } else if (month >= 9 && month <= 11) {
                return "Fall";
            } else {
                return "Winter";
            }
        } else {
            return "-1";
        }
    }
}

/*
* (1) Y(연도), M(월), D(일)이 정수로 주어짐
* (2) Y에 M월 D일이 존재한다면 어떤 계절인지 출력
* (3) 존재하지 않는다면 -1을 출력
* (4) 3 ~ 5 : 봄 (Spring)
* (5) 6 ~ 8 : 여름 (Summer)
* (6) 9 ~ 11 : 가을 (Fall)
* (7) 12 ~ 2 : 겨울 (Winter)
* (8) 윤년체크해야 함
* 1, 3, 5, 7, 8, 10, 12 = 31일
* 4, 6, 9, 11 = 30일
* 2 = 28일(윤년 X) | 2 = 29일(윤년 O) 
*/