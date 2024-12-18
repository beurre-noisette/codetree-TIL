import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.print(isIt(arr1, arr2)? "Yes" : "No");

        sc.close();
    }

    private static boolean isIt(int[] a, int[] b) {
        if (b.length > a.length) {
            return false;
        }

        for (int i = 0; i <= a.length - b.length; i++) {
            boolean found = true;

            for (int j = 0; j < b.length; j++) {
                if (a[i + j] != b[j]) {
                    found = false;
                    break;
                }
            }

            if (found) {
                return true;
            }
        }

        return false;
    }
}