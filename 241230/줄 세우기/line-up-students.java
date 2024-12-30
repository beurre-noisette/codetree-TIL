import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] stus = new Student[n];
        int number = 1;

        for (int i = 0; i < stus.length; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            stus[i] = new Student(number, height, weight);
            number++;
        }

        Arrays.sort(stus);

        for (Student stu : stus) {
            System.out.println(stu);
        }

        sc.close();
    }
}

class Student implements Comparable<Student> {
    int number;
    int height;
    int weight;

    public Student(int number, int height, int weight) {
        this.number = number;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return height + " " + weight + " " + number;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height != student.height) {
            return student.height - this.height;
        }

        if (this.weight != student.weight) {
            return student.weight - this.weight;
        }

        return this.number - student.number;
    }
}

/*
* (1) 키, 몸무게 정보가 주어짐
* (2) 키가 더 큰 학생이 앞으로 와야함(키에 대해 내림차순)
* (3) 키가 같다면 몸무게가 더 큰 학생이 앞에 와야 함(몸무게에 대해 내림차순)
* (4) 키 몸무게가 같다면 번호가 작은 학생이 앞에 와야함(번호에 대해 오름차순)
* (5) 번호는 입력된 순서대로 부여 (1부터 시작함)
*/