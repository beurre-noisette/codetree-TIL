import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] stus = new Student[n];
        
        for (int i = 0; i < stus.length; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            stus[i] = new Student(height, weight, i + 1);
        }

        Arrays.sort(stus);

        for (Student stu : stus) {
            System.out.println(stu.height + " " + stu.weight + " " + stu.number);
        }

        sc.close();
    }
}

class Student implements Comparable<Student> {
    int height;
    int weight;
    int number;

    public Student(int height, int weight, int number) {
        this.height = height;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        if (this.height != student.height) {
            return this.height - student.height;
        }

        return student.weight - this.weight;
    }
}

/*
* (1) 키가 더 작은 학생이 앞에 와야 합니다.(키에 대해 오름차순)
* (2) 몸무게가 더 큰 학생이 앞에 와야 합니다.(몸무게에 대해 내림차순)
* (3) 번호는 입력된 순서대로 부여함
*/