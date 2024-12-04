import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr= new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxVal = 0;
        int minVal = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 500 && maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 500) {
                minVal = arr[i];
                break;
            }
        }

        for (int i : arr) {
            if (i > 500 && minVal > i) {
                minVal = i;
            }
        }

        System.out.print(maxVal + " " + minVal);

        sc.close();
    }
}

/*
* '500미만의 수 중 가장 큰 수'와 '500 초과의 수 중 가장 작은 수'
*/