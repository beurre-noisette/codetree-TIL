import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Pair[] pairs = new Pair[n];
        
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(sc.nextInt(), i);
        }
        
        Arrays.sort(pairs);
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[pairs[i].originalIndex] = i + 1;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        
        sc.close();
    }
}

class Pair implements Comparable<Pair> {
    int value;
    int originalIndex;
    
    public Pair(int value, int originalIndex) {
        this.value = value;
        this.originalIndex = originalIndex;
    }
    
    @Override
    public int compareTo(Pair other) {
        if (this.value != other.value) {
            return Integer.compare(this.value, other.value);
        }
        return Integer.compare(this.originalIndex, other.originalIndex);
    }
}