import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        int len = A.length();
        StringBuilder sb = new StringBuilder(A);
        
        for (int i = 1; i <= len; i++) {
            char lastChar = sb.charAt(len - 1);
            sb.deleteCharAt(len - 1);
            sb.insert(0, lastChar);
            
            if (sb.toString().equals(B)) {
                System.out.println(i);
                return;
            }
        }
        
        System.out.println(-1);
    }
}