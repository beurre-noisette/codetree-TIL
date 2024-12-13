import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.indexOf(str2) == -1) {
            System.out.print("No");
        } else {
            System.out.print(str1.indexOf(str2));
        }

        sc.close();
    }
}