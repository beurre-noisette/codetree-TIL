import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = sc.next().toCharArray();
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'e') {
                idx = i;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i == idx) {
                continue;
            } else {
                sb.append(arr[i]);
            }
        }

        System.out.print(sb.toString());

        sc.close();
    }
}