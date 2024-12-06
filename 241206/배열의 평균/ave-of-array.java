import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        double[] avgRow = new double[2];
        double[] avgCol = new double[4];
        double sumTotal = 0;
        double avgTotal = 0;

        for (int i = 0; i < 2; i++) {
            int sum = 0;

            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }

            avgRow[i] = Math.round(((double) sum / 4) * 10) / 10.0;
        }

        for (int j = 0; j < 4; j++) {
            int sum = 0;

            for (int i = 0; i < 2; i++) {
                sum += arr[i][j];
            }

            avgCol[j] = Math.round(((double) sum / 2) * 10) / 10.0;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sumTotal += arr[i][j];
            }
        }

        avgTotal = sumTotal / 8;

        for (int i = 0; i < avgRow.length; i++) {
            System.out.print(avgRow[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < avgCol.length; i++) {
            System.out.print(avgCol[i] + " ");
        }

        System.out.println();

        System.out.print(avgTotal);

        sc.close();
    }
}
