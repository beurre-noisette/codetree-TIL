import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];

        for (int i = 0; i < agents.length; i++) {
            char codeName = sc.next().charAt(0);
            int grade = sc.nextInt();
            agents[i] = new Agent(codeName, grade);
        }

        int minIdx = 0;
        int minGrade = agents[0].grade;

        for (int i = 1; i < agents.length; i++) {
            if (minGrade > agents[i].grade) {
                minGrade = agents[i].grade;
                minIdx = i;
            }
        }

        System.out.print(agents[minIdx]);

        sc.close();
    }
}

class Agent {
    char codeName;
    int grade;

    public Agent() {

    }

    Agent(char codeName, int grade) {
        this.codeName = codeName;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return codeName + " " + grade;
    }
}