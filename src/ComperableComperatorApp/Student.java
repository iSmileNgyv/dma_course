package ComperableComperatorApp;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private ArrayList<Student> students = new ArrayList<>();

    public Student() {}
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    @Override
    public String toString() {
        return String.format("Student{name=%s, age=%d}", this.name, this.age);
    }


    @Override
    public int compareTo(@NotNull Student o) {
        return this.name.compareTo(o.name);
    }
}
