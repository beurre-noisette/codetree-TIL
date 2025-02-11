import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read N
        int N = scanner.nextInt();
        
        // Calculate sum
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += scanner.nextInt();
        }
        
        String sumStr = String.valueOf(sum);
        String shifted = sumStr.substring(1) + sumStr.charAt(0);
        
        System.out.println(shifted);
        
        scanner.close();
    }
}