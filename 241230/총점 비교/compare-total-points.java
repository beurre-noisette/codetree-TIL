import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Student[] stus = new Student[n];

        for (int i = 0; i < stus.length; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            stus[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(stus);

        for (Student stu : stus) {
            System.out.println(stu);
        }

        sc.close();
    }
}

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        return name + " " + kor + " " + eng + " " + math;
    }

    @Override
    public int compareTo(Student student) {
        return (this.kor + this.eng + this. math) - (student.kor + student.eng + student.math);
    }
}

/*
* (1) n이 주어지고, n명인 학생수의 이름과 세 과목의 점수가 주어지면
* (2) 총점이 낮은순(오름차순)으로 정렬하여 출력하는 프로그램 작성
*/