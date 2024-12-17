import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(getMin(a, b, c));

        sc.close();

    }

    private static int getMin(int a, int b, int c) {
        int[] nums = {a, b, c};
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
        }

        return min;
    }
}