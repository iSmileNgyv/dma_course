package CourseStudentApp;

import CourseStudentApp.Exceptions.IsExistException;

import java.util.ArrayList;

public class Course<T> {
    private String name;
    private Subject subject;
    private ArrayList<T> students = new ArrayList<>();

    public Course() {}
    public Course(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void addStudent(T student) {
        this.isExist(student);
        students.add(student);
    }

    public void removeStudent(T student) {
        this.isNotExist(student);
        students.remove(student);
    }

    private void isExist(T student) {
        if(this.students.contains(student)) {
            throw new IsExistException("Is exist");
        }
    }

    private void isNotExist(T student) {
        if(this.students.contains(student)) {
            throw new IsExistException("Is not exist");
        }
    }

    public void displayStudents() {
        for(var student : this.students) {
            System.out.println(student);
        }
    }
}
