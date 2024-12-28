import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product pr1 = new Product("codetree", 50);
        Product pr2 = new Product(
            sc.next(),
            sc.nextInt()
        );

        System.out.println(pr1);
        System.out.println(pr2);

        sc.close();
    }   
}

class Product {
    String name;
    int code;

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public String toString() {
        return "product " + code + " is " + name;
    }
}