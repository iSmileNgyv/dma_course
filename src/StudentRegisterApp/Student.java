package StudentRegisterApp;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private String name;
    private LocalDate dateOfBirth;
    private Student[] students = new Student[this.studentCount];
    private int studentCount = 0;

    public Student() {}
    public Student(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
    }

    public Student(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        System.out.println("Ad: " + this.name + " Doğum tarixi: " + this.dateOfBirth);
    }

    public Student[] cloneStudent() {
        return this.students.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void addStudent(Student student) {
        Student[] newStudents = copyOfStudents(true);
        newStudents[this.studentCount] = student;
        this.students = newStudents;
        this.studentCount++;
    }

    public int calculateAge() {
        LocalDate now = LocalDate.now();
        return Period.between(this.dateOfBirth, now).getYears();
    }

    public Student[] copyOfStudents() {
        return this.copyOfStudents(false);
    }

    private Student[] copyOfStudents(boolean add) {
        Student[] newStudents = new Student[add ? this.studentCount + 1 : this.studentCount];
        for(int i = 0; i < this.studentCount; i++) {
            newStudents[i] = this.students[i];
        }
        return newStudents;
    }

    public void filterStudents(Filters filter) {
        switch(filter) {
            case MAX_AGE_18:
                int c = 0;
                for(int i = 0; i < this.studentCount; i++) {
                    if(this.students[i].calculateAge() < 18) {
                        c++;
                        System.out.println(this.students[i].getName());
                    }
                }
                if(c == 0) {
                    System.out.println("18 yaşından kiçik tələbə yoxdur");
                }
                break;
        }
    }
}
