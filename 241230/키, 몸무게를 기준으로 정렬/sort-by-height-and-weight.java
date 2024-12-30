import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Person[] people = new Person[n];

        for (int i = 0; i < people.length; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }

        sc.close();
    }
}

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Person person) {
        if (this.height == person.height) {
            return person.weight - this.weight;
        }

        return this.height - person.height;
    }

    @Override
    public String toString() {
        return name + " " + height + " " + weight;
    }
}

/*
* (1) 키는 오름차순 정렬
* (2) 키가 동일하면 몸무게 내림차순 정렬
*/