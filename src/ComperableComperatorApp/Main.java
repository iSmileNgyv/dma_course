package ComperableComperatorApp;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var student = new Student();

        student.addStudent(new Student("Ismayil", 24));
        student.addStudent(new Student("Elchin", 30));

        student.getStudents().sort(new StudentComparator());
        student.getStudents().forEach(System.out::println);
        System.out.println();
        Collections.sort(student.getStudents());
        student.getStudents().forEach(System.out::println);


    }
}
