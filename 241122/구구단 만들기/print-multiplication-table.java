import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        List<Integer> target = new ArrayList<Integer>();

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                target.add(i);
            }
        }

        for (int j = 1; j <= 9; j++) {
            for (int i = target.size() - 1; i >= 0; i--) {
                int currentNum = target.get(i);
                System.out.print(currentNum + " * " + j + " = " + (currentNum * j));
                if (i > 0) {
                    System.out.print(" / ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}