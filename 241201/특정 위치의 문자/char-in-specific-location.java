import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};
        char c = sc.next().charAt(0);
        int idx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (c == arr[i]) {
                idx = i;
            }
        }

        if (idx == -1) {
            System.out.print("None");
        } else {
            System.out.print(idx);
        }

        sc.close();
    }
}