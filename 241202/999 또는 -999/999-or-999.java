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
                arr[i] = 0;
                break;
            }
        }
        
        OptionalInt maxVal = Arrays.stream(arr).max();
        OptionalInt minVal = Arrays.stream(arr).min();

        System.out.println(maxVal.getAsInt() + " " + minVal.getAsInt());
        
        sc.close();
    }
}