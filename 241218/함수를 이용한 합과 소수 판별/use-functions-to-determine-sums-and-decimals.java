import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 입력 받기
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        
        // a부터 b까지의 각 숫자에 대해 조건 검사
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && isEvenDigitSum(i)) {
                cnt++;
            }
        }
        
        System.out.print(cnt);
        sc.close();
    }
    
    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        int sqrtNum = (int)Math.sqrt(num);
        for (int i = 3; i <= sqrtNum; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    private static boolean isEvenDigitSum(int num) {
        int sum = 0;
        while (num > 0) {    
            sum += num % 10;  
            num /= 10;        
        }
        return sum % 2 == 0; 
    }
}