import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntWrapper n = new IntWrapper(sc.nextInt());
        IntWrapper m = new IntWrapper(sc.nextInt());

        swap(n, m);

        System.out.print(n.value + " " + m.value);

        sc.close();
    }

    public static void swap(IntWrapper a, IntWrapper b) {
        int temp = a.value;

        a.value = b.value;

        b.value = temp;
    }
}

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

/*
* (1) 정수 n, m이 주어지면 두 개의 숫자에 있는 값을 교환하여 출력하는 프로그램 작성
* (2) a, b를 인자로 하는 함수를 작성하여 두 변수에 담겨있는 값을 교환하고
* (3) 출력은 함수 호출 이후에 진행하도록 한다.
*/