import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String binary = sc.next();

        int decimal = Integer.parseInt(binary, 2);

        decimal *= 17;

        System.out.println(Integer.toBinaryString(decimal));

        sc.close();
    }
}