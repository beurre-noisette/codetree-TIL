import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        calc(a, b);

        System.out.print(a.value + " " + b.value);

        sc.close();
    }

    private static void calc(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        } else {
            a.value += 10;
            b.value *= 2;
        }
    }
}

/*
* (1) 두 개의 정수 a, b
* (2) 작은수에는 + 10, 큰 수에는 * 2 -> 저장
* (3) 메서드 이용, 출력은 메서드 호출 이후 진행
*/