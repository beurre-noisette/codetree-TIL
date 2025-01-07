import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.nextLine();
        
        int[] path = new int[2001];
        int offset = 1000;
        
        int currentPos = offset;
        
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(" ");
            int distance = Integer.parseInt(command[0]);
            String direction = command[1];
            
            int nextPos = currentPos + (direction.equals("R") ? distance : -distance);
            
            int start = Math.min(currentPos, nextPos);
            int end = Math.max(currentPos, nextPos);
            
            for (int j = start; j < end; j++) {
                path[j]++;
            }
            
            currentPos = nextPos;
        }
        
        int count = 0;
        for (int i = 0; i < path.length; i++) {
            if (path[i] >= 2) {
                count++;
            }
        }
        
        System.out.println(count);
        scanner.close();
    }
}