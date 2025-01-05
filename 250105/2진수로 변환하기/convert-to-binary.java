import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> binary = new ArrayList<>();

        if (n == 0) {
            binary.add(0);
        }

        while (n > 0) {
            binary.add(0, n % 2);
            n /= 2;
        }

        for (int i = 0; i < binary.size(); i++) {
            System.out.print(binary.get(i));
        }

        sc.close();
    }
}