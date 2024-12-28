import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Hint hint = new Hint(
            sc.next(),
            sc.next().charAt(0),
            sc.nextInt()
        );

        System.out.println("code : " + hint.code);
        System.out.println("color : " + hint.color);
        System.out.println("second : " + hint.second);

        sc.close();
    }
}

class Hint {
    String code;
    char color;
    int second;

    public Hint(String code, char color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}