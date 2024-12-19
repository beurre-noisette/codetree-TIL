import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(isExist(m, d)? "Yes" : "No");

        sc.close();
    }

    private static boolean isExist(int m, int d) {
        int[] with31 = {1, 3, 5, 7, 8, 10, 12};
        int[] with30 = {4, 6, 9, 11};

        if (m == 2) {
            return d >= 1 && d <= 28;
        }

        for (int i : with31) {
            if (m == i) {
                return d >= 1 && d <= 31;
            }
        }

        for (int i : with30) {
            if (m == i) {
                return d >= 1 && d <= 30;
            }
        }

        return false;
    }
}

/*
* (1) 두 개의 정수 M, D 2021년의 날짜중 M월 D일이 존재하면 "Yes", 존재하지 않으면 "No"
* (2) 2021년 2월은 28일 까지 있음
* 1, 3, 5, 7, 8, 10, 12 = 31일
* 4, 6, 9, 11 = 30일
* 2
*/