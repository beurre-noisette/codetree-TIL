import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        String[] dict = new String[n];

        for (int i = 0; i < dict.length; i++) {
            dict[i] = sc.next();
        }

        Arrays.sort(dict);

        int cnt = 0;

        for (int i = 0; i < dict.length; i++) {
            if (dict[i].startsWith(t)) {
                cnt++;
                if (cnt == k) {
                    System.out.println(dict[i]);
                    break;
                }
            }
        }
        
        sc.close();
    }
}

/*
* (1) 단어 n개가 주어졌을 때, 문자열 T로 시작하는 단어들 중 사전순으로 정렬했을 때의 k번째 문자열을 출력
*/