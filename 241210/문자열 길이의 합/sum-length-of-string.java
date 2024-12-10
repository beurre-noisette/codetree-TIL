import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        int lenAll = 0;
        int cnt = 0;

        for (String s : arr) {
            lenAll += s.length();
            if (s.charAt(0) == 'a') {
                cnt++;
            }
        }

        System.out.print(lenAll + " " + cnt);

        sc.close();
    }
}