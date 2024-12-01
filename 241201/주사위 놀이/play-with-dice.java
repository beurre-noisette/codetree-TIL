import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] diceResult = new int[10];
        int[] cntResult = new int[7]; // 1 ~ 6을 검사

        for (int i = 0; i < diceResult.length; i++) {
            diceResult[i] = sc.nextInt();
        }

        for (int i = 0; i < diceResult.length; i++) {
            cntResult[diceResult[i]]++;
        }

        for (int i = 1; i < cntResult.length; i++) {
            System.out.println(i + " - " + cntResult[i]);
        }

        sc.close();
    }
}