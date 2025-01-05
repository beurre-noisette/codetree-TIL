import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();
        ArrayList<Integer> binary = new ArrayList<>();
        while(n > 0) {
            binary.add(n % 2);
            n /= 2;
        }
        for(int i = binary.size() - 1; i >= 0; i--) {
            System.out.print(binary.get(i));
        }

        sc.close();
    }
}