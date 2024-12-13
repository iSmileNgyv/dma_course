package CourseStudentApp;

import CourseStudentApp.Exceptions.IsExistException;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student() {}
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCourse(Course<Student> course) {
        this.isExist(course);
        courses.add(course);
    }

    public void removeCourse(Course<Student> course) {
        this.isNotExist(course);
        courses.remove(course);
    }

    private void isExist(Course<Student> course) {
        if(this.courses.contains(course)) {
            throw new IsExistException("Is exist");
        }
    }

    private void isNotExist(Course<Student> course) {
        if(!this.courses.contains(course)) {
            throw new IsExistException("Is not exist");
        }
    }

    public void displayCourses() {
        for(var course : this.courses) {
            System.out.println(course.getName());
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return this.id == other.id;
    }
}
