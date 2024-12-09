import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        int maxLen = arr[0].length();
        int minLen = arr[0].length();

        for (int i = 0; i < arr.length; i++) {
            if (maxLen < arr[i].length()) {
                maxLen = arr[i].length();
            }

            if (minLen > arr[i].length()) {
                minLen = arr[i].length();
            }
        }

        System.out.println(maxLen - minLen);

        sc.close();
    }
}