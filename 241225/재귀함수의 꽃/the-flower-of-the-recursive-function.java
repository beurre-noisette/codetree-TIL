import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        print(n);

        sc.close();
    }

    private static void print(int n) {
        System.out.print(n + " ");
   
        if (n == 1) {
            System.out.print("1 ");
            return; 
        }

        print(n - 1);
        System.out.print(n + " ");
    }
}

/*
* (1) 재귀함수를 단 하나만 이용할 것
* (2) N에서 1까지 1씩 감소하며 하나씩 출력했다가, 다시 1부터 N까지 1씩 증가하며 출력
*/