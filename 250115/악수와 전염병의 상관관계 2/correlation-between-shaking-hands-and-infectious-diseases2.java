import java.util.*;

class Handshake implements Comparable<Handshake> {
    int time;
    int x;
    int y;

    public Handshake(int time, int x, int y) {
        this.time = time;
        this.x = x - 1;
        this.y = y - 1;
    }

    @Override
    public int compareTo(Handshake other) {
        return this.time - other.time;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int P = sc.nextInt() - 1;  // 0-based index로 변환
        int T = sc.nextInt();

        // 악수 정보 저장
        List<Handshake> handshakes = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            handshakes.add(new Handshake(t, x, y));
        }

        // 시간순 정렬
        Collections.sort(handshakes);

        // 감염 상태와 전염 가능 횟수 관리
        boolean[] infected = new boolean[N];
        int[] remainingInfections = new int[N];

        // 초기 감염자 설정
        infected[P] = true;
        remainingInfections[P] = K;

        // 각 악수마다 전염 여부 확인
        for(Handshake hs : handshakes) {
            // 둘 다 감염자인 경우
            if(infected[hs.x] && infected[hs.y]) {
                if(remainingInfections[hs.x] > 0) remainingInfections[hs.x]--;
                if(remainingInfections[hs.y] > 0) remainingInfections[hs.y]--;
            }
            // x만 감염자인 경우
            else if(infected[hs.x] && remainingInfections[hs.x] > 0) {
                infected[hs.y] = true;
                remainingInfections[hs.y] = K;
                remainingInfections[hs.x]--;
            }
            // y만 감염자인 경우
            else if(infected[hs.y] && remainingInfections[hs.y] > 0) {
                infected[hs.x] = true;
                remainingInfections[hs.x] = K;
                remainingInfections[hs.y]--;
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for(boolean inf : infected) {
            sb.append(inf ? "1" : "0");
        }
        System.out.println(sb);
    }
}