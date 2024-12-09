import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char[] arr = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                System.out.print(arr[i]);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != ' ') {
                System.out.print(arr2[i]);
            }
        }

        sc.close();
    }
}