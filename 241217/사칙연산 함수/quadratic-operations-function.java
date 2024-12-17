import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String o = sc.next();
        int c = sc.nextInt();

        switch (o) {
            case "+":
                System.out.print(a + " " + o + " " + c + " = " + sum(a, c));
                break;
            case "-":
                System.out.print(a + " " + o + " " + c + " = " + substract(a, c));
                break;
            case "/":
                System.out.print(a + " " + o + " " + c + " = " + divide(a, c));
                break;
            case "*":
                System.out.print(a + " " + o + " " + c + " = " + multiple(a, c));
                break;
            default:
                System.out.print("False");
        }

        sc.close();
    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int substract(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }

    private static int multiple(int a, int b) {
        return a * b;
    }
}