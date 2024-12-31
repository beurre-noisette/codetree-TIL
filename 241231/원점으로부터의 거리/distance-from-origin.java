import java.util.*;

class Point implements Comparable<Point> {
    int x, y;
    int index;
    int distance;
    
    public Point(int x, int y, int index) {
        this.x = x;
        this.y = y;
        this.index = index;
        this.distance = Math.abs(x) + Math.abs(y);
    }
    
    @Override
    public int compareTo(Point other) {
        if (this.distance == other.distance) {
            return Integer.compare(this.index, other.index);
        }
        return Integer.compare(this.distance, other.distance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        List<Point> points = new ArrayList<>();
        
        for (int i = 1; i <= N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y, i));
        }
        
        Collections.sort(points);
        
        for (Point p : points) {
            System.out.println(p.index);
        }
        
        sc.close();
    }
}