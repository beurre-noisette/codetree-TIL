import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        for (int i = 0; i < 2; i++) {
            System.out.println(text);
        }
        
        sc.close();
    }
}