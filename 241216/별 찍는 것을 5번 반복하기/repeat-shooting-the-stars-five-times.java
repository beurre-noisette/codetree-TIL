public class Main {
    public static void main(String[] args) {
        printTenStars();
        printTenStars();
        printTenStars();
        printTenStars();
        printTenStars();
    }

    private static void printTenStars() {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}