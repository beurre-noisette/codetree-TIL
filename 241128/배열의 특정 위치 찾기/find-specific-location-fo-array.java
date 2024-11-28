import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sumOdd = 0;
        int sumEven = 0;
        double mulThree = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < arr.length; i+=2) {
            sumOdd += arr[i];
        }

        for (int i = 2; i < arr.length; i+=3) {
            sumEven += arr[i];
        }

        mulThree = (double) sumEven / 3;

        System.out.print(sumOdd + " " + mulThree);

        sc.close();
    }
}