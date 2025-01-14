import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        Map<Integer, Integer> robotA = new TreeMap<>();
        Map<Integer, Integer> robotB = new TreeMap<>();
        
        int posA = 0;
        int timeA = 0;
        robotA.put(0, 0);
        
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            int move = (d == 'L') ? -1 : 1;
            
            for (int j = 0; j < t; j++) {
                timeA++;
                posA += move;
                robotA.put(timeA, posA);
            }
        }
        
        int posB = 0;
        int timeB = 0;
        robotB.put(0, 0);
        
        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            int move = (d == 'L') ? -1 : 1;
            
            for (int j = 0; j < t; j++) {
                timeB++;
                posB += move;
                robotB.put(timeB, posB);
            }
        }
        
        int lastPosA = robotA.get(timeA);
        int lastPosB = robotB.get(timeB);
        
        int count = 0;
        int maxTime = Math.max(timeA, timeB);
        
        for (int time = 1; time <= maxTime; time++) {
            int currA = time <= timeA ? robotA.get(time) : lastPosA;
            int currB = time <= timeB ? robotB.get(time) : lastPosB;
            int prevA = time - 1 <= timeA ? robotA.get(time - 1) : lastPosA;
            int prevB = time - 1 <= timeB ? robotB.get(time - 1) : lastPosB;
            
            if (prevA != prevB && currA == currB) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}

