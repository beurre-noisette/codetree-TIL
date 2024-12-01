import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int queryType = sc.nextInt();
            
            if (queryType == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a]);
                
            } else if (queryType == 2) {
                int b = sc.nextInt();
                int found = 0;
                
                for (int j = 1; j <= n; j++) {
                    if (arr[j] == b) {
                        found = j;
                        break;
                    }
                }
                System.out.println(found);
                
            } else if (queryType == 3) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                
                for (int j = s; j < e; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println(arr[e]);
            }
        }
        
        sc.close();
    }
}

/**
* n 개의 원소 | q 개의 질의
* q는 다음 세가지 중 하나
* q-1 : 1a -> a번째 원소를 출력
* q-2 : 2b -> n개의 원소 중에 값이 b 인 원소를 찾아 그 원소가 몇번째 원소인지 출력
* 그 원소가 여러 개라면, 그 중에서 index가 제일 작은 원소의 것을 출력, 그것도 없으면 0 출력
* q-3 : 3se -> s 번째 원소부터 e 번째 원소까지 각 원소 값을 공백으로 구분하여 차례로 출력
* 각 질의를 차례로 수행하는 프로그램을 작성
*/