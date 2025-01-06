import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Point> points = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            points.add(new Point(x1, true));  // 시작점
            points.add(new Point(x2, false)); // 끝점
        }

        // 시작점과 끝점을 기준으로 정렬
        points.sort((a, b) -> {
            if (a.x == b.x) {
                return Boolean.compare(a.isStart, b.isStart);
            }
            return Integer.compare(a.x, b.x);
        });

        int maxOverlap = 0;
        int currentOverlap = 0;

        for (Point point : points) {
            if (point.isStart) {
                currentOverlap++;
                maxOverlap = Math.max(maxOverlap, currentOverlap);
            } else {
                currentOverlap--;
            }
        }

        System.out.println(maxOverlap);
    }
}

class Point {
    int x;
    boolean isStart;

    Point(int x, boolean isStart) {
        this.x = x;
        this.isStart = isStart;
    }
}