import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sCode = sc.next();
        String mP = sc.next();
        int t = sc.nextInt();

        Memo memo = new Memo(sCode, mP, t);

        System.out.println("secret code : " + memo.secretCode);
        System.out.println("meeting point : " + memo.meetingPoint);
        System.out.println("time : " + memo.time);

        sc.close();
    }
}

class Memo {
    String secretCode;
    String meetingPoint;
    int time;

    public Memo(String secretCode, String meetingPoint, int time) {
        this.secretCode = secretCode;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }
}