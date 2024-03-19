package 학생성적;

import java.util.Comparator;

public class Student_g implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.grade > o2.grade) return 1;
        else if(o1.grade == o2.grade) return o1.name.compareTo(o2.name);
        else return -1;
    }
}