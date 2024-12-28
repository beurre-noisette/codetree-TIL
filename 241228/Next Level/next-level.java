import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userId = sc.next();
        int userLevel = sc.nextInt();

        Character c1 = new Character("codetree", 10);
        Character c2 = new Character(userId, userLevel);

        System.out.println(c1);
        System.out.println(c2);

        sc.close();
    }
}

class Character {
    String id;
    int level;

    Character(String id, int level) {
        this.id = id;
        this.level = level;
    }

    @Override
    public String toString() {
        return "user " + id + " lv " + level;
    }
}