import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 1부터 N까지 출력
        printAscending(N, 1);
        
        // N부터 1까지 출력
        printDescending(N, N);
        
        sc.close();
    }

    public static void printAscending(int N, int current) {
        if (current > N) {
            System.out.println();
            return;
        }
        
        System.out.print(current + " ");
        printAscending(N, current + 1);
    }
    
    public static void printDescending(int N, int current) {
        if (current < 1) {
            System.out.println();
            return;
        }
        
        System.out.print(current + " ");
        printDescending(N, current - 1);
    }
}