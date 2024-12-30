import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people, (p1, p2) -> {
            return p1.name.compareTo(p2.name);
        });

        System.out.println("name");

        for (Person person : people) {
            System.out.printf("%s %d %.1f\n", person.name, person.height, person.weight);
        }

        System.out.println();

        Arrays.sort(people, (p1, p2) -> {
            return p2.height - p1.height;
        });

        System.out.println("height");

        for (Person person : people) {
            System.out.printf("%s %d %.1f\n", person.name, person.height, person.weight);
        }

        sc.close();
    }
}

class Person {
    String name;
    int height;
    double weight;

    public Person(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}