import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < a.length(); i++) {
            char[] bits = a.toCharArray();
            bits[i] = (bits[i] == '0') ? '1' : '0';
            String modified = new String(bits);
            int value = Integer.parseInt(modified, 2);
            if (value > max) {
                max = value;
            }
        }

        System.out.println(max);
    }
}