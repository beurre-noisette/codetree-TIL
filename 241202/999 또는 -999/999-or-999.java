import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 999 || arr[i] == -999) {
                break;
            }
        }

        int maxVal = arr[0];
        int minVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 999 && arr[i] != -999) {
                if (maxVal < arr[i]) {
                    maxVal = arr[i];
                }
            }
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != 999 && arr[i] != -999) {
                if (minVal > arr[i]) {
                    minVal = arr[i];
                }
            }
        }

        System.out.print(maxVal + " " + minVal);

        sc.close();

    }
}