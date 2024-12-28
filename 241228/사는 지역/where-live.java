import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String location = sc.next();
            persons[i] = new Person(name, address, location);
        }

        Arrays.sort(persons);

        System.out.println("name " + persons[0].name);
        System.out.println("addr " + persons[0].address);
        System.out.println("city " + persons[0].location);

        sc.close();
    }
}

class Person implements Comparable<Person> {
    String name;
    String address;
    String location;

    public Person(String name, String address, String location) {
        this.name = name;
        this.address = address;
        this.location = location;
    }

    @Override
    public int compareTo(Person other) {
        return other.name.compareTo(this.name);
    }
}