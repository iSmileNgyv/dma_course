package CourseStudentApp;

import CourseStudentApp.Exceptions.IsExistException;

import java.util.ArrayList;

public class Operation {
    private ArrayList<String> logs = new ArrayList<>();

    public void registerStudent(Student student, Course<Student> course) {
        course.addStudent(student);
        student.addCourse(course);
        this.addLog(String.format("Student %s has been registered to course %s", student.getName(), course.getName()));
    }

    public void removeStudent(Student student, Course<Student> course) {
        course.removeStudent(student);
        student.removeCourse(course);
        this.addLog(String.format("Student %s has been removed from course %s", student.getName(), course.getName()));
    }

    public void displayInfo() {
        int cnt = 1;
        for(String log : this.logs) {
            System.out.println(cnt + ". " + log);
            cnt++;
        }
    }

    private void addLog(String message) {
        this.logs.add(message);
    }
}
