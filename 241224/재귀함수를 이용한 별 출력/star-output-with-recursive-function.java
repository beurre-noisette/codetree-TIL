import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printStar(n);

        sc.close();
    }

    private static void printStar(int n) {
        if (n <= 0) {
            return;
        }
        printStarRecursive(n, n);
    }

    private static void printStarRecursive(int n, int currentRow) {
        if (currentRow <= 0) {
            return;
        }

        printStarRecursive(n, currentRow - 1);

        printStarsInRow(currentRow);
        System.out.println();
    }

    private static void printStarsInRow(int stars) {
        if (stars <= 0) {
            return;
        }

        System.out.print("*");

        printStarsInRow(stars - 1);
    }
}

/*
* (1) 재귀함수로 별찍기
*/