package 학생성적;

import Comparator예제.DesendingComparator;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class GradeStudent {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new Student_g());
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 수 입력: ");
        int n = sc.nextInt();
        for (int i = 0; i< n; i++){
            System.out.print("학생 이름과 성적 입력 : ");
            String name = sc.next();
            int grade = sc.nextInt();
            students.add(new Student(name,grade));
        }
        for (Student student : students){
            System.out.println(student);
        }
    }
}
