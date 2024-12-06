import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 
            arr[0][0] +
            arr[1][0] + arr[1][1] +
            arr[2][0] + arr[2][1] + arr[2][2] +
            arr[3][0] + arr[3][1] + arr[3][2] + arr[3][3];

        System.out.print(sum);

        sc.close();
    }
}

/*
* (0, 0)
* (1, 0) (1, 1)
* (2, 0) (2, 1) (2, 2)
* (3, 0) (3, 1) (3, 2) (3, 3)
*/