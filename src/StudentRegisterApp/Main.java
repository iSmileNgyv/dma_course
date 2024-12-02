package StudentRegisterApp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var student = new Student();
        student.setName("İsmayıl");
        student.setDateOfBirth(LocalDate.of(2000, 1, 21));
        student.addStudent(student);
        student.addStudent(new Student("Tural", "1999-01-01"));
        student.addStudent(new Student("Aydın", "2009-01-01"));
        for(int i = 0; i < student.getStudents().length; i++) {
            student.getStudents()[i].displayInfo();
        }

        System.out.println("\nClone edilmiş array:");
        for(int i = 0; i < student.cloneStudent().length; i++) {
            student.getStudents()[i].displayInfo();
        }
        System.out.println("\nManual copy edilmiş array:");
        for(int i = 0; i < student.copyOfStudents().length; i++) {
            student.getStudents()[i].displayInfo();
        }

        System.out.println("18 yaşından kiçik tələbələr");
        student.filterStudents(Filters.MAX_AGE_18);
    }
}
