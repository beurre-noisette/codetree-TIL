import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < students.length; i++) {
            String name = sc.next();
            int korScore = sc.nextInt();
            int engScore = sc.nextInt();
            int mathScore = sc.nextInt();
            students[i] = new Student(name, korScore, engScore, mathScore);
        }

        Arrays.sort(students, (stu1, stu2) -> {
            if (stu1.korScore == stu2.korScore) {
                if (stu1.engScore == stu2.engScore) {
                    return stu2.mathScore - stu1.mathScore;
                }
                return stu2.engScore - stu1.engScore;
            }
            return stu2.korScore - stu1.korScore;
        });

        for (Student student : students) {
            System.out.println(student);
        }

        sc.close();
    }
}

class Student {
    String name;
    int korScore;
    int engScore;
    int mathScore;

    public Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }
    
    @Override
    public String toString() {
        return name + " " + korScore + " " + engScore + " " + mathScore;
    }
}

/*
* (1) n이 주어지고, n명인 학생수의 이름과 국어, 영어, 수학 세 과목의 점수가 주어지면
* (2) 국어, 영어, 수학 순서대로 우선순위로 하여 과목 점수가 높은 학생부터 출력하는 프로그램 작성
*/