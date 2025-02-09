import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(solution(num1, num2));

    }

    public static int solution(int a, int b) {
        String source = Integer.toString(a + b);

        int cnt = 0;

        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == '1') {
                cnt++;
            }
        }

        return cnt;
    }

}