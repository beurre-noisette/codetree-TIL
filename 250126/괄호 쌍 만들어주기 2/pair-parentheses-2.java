import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Integer> openPairs = new ArrayList<>();
        List<Integer> closePairs = new ArrayList<>();
        
        // Collect all indices where "(( " occurs
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '(' && s.charAt(i + 1) == '(') {
                openPairs.add(i);
            }
        }
        
        // Collect all indices where "))" occurs
        for (int j = 0; j < s.length() - 1; j++) {
            if (s.charAt(j) == ')' && s.charAt(j + 1) == ')') {
                closePairs.add(j);
            }
        }
        
        int count = 0;
        // For each opening pair, count valid closing pairs
        for (int o : openPairs) {
            int minCloseIndex = o + 2;
            for (int c : closePairs) {
                if (c >= minCloseIndex) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}