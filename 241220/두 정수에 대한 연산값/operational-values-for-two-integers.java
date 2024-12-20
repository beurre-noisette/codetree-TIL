import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());

        calcOrigin(a, b);

        System.out.print(a.value + " " + b.value);

        sc.close();
    }

    private static void calcOrigin(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            a.value += 25;
            b.value *= 2;
        } else {
            a.value *= 2;
            b.value += 25;
        }
    }
}

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

/*
* (1) 두 개의 정수 a, b가 주어지면 두 개의 숫자 중 큰 수에는 +25 작은수에는 *2 저장한 뒤 출력
* (2) a, b를 인자로 하는 함수를 작성하여 값을 수정하고 출력은 함수 호출 이후에 진행
*/