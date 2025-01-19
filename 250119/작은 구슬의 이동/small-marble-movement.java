import java.util.Scanner;

public class Main {
    static final int[] dx = {0, 0, -1, 1};
    static final int[] dy = {-1, 1, 0, 0};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        char d = sc.next().charAt(0);
        
        int dir = getDirection(d);
        int time = 0;
        
        while (time < t) {
            int nx = r + dx[dir];
            int ny = c + dy[dir];
            
            if (nx < 1 || nx > n || ny < 1 || ny > n) {
                dir = reverseDirection(dir);
                time++;
            } else {
                r = nx;
                c = ny;
                time++;
            }
        }
        
        System.out.println(r + " " + c);
        sc.close();
    }
    
    private static int getDirection(char d) {
        switch(d) {
            case 'L': return 0;
            case 'R': return 1;
            case 'U': return 2;
            default: return 3;
        }
    }
    
    private static int reverseDirection(int dir) {
        return dir % 2 == 0 ? dir + 1 : dir - 1;
    }
}