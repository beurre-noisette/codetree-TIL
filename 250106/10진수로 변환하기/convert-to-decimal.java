import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        int decimalN = Integer.parseInt(n, 2);

        System.out.println(decimalN);

        sc.close();
    }
}