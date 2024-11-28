import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(sc.next());
        }

        System.out.print(sb.charAt(1) + " " + sb.charAt(4) + " " + sb.charAt(7));

        sc.close();
    }
}