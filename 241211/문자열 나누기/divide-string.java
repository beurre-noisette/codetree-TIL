import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];
        String str = "";

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
            str+=arr[i];
        }

        for (int i = 0; i < str.length(); i++) {
            if (i % 5 == 0 && i != 0) {
                System.out.println();
                System.out.print(str.charAt(i));
            } else {
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}