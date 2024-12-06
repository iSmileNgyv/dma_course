package StudentMapApp;

import StudentMapApp.Exceptions.StudentExistException;
import StudentMapApp.Exceptions.StudentNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class Operation {
    private final Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student student) {
        if(students.containsKey(student.getId())) {
            throw new StudentExistException(String.format("ID %d-yə sahib student sistemdə mövcuddur", student.getId()));
        }
        students.put(student.getId(), student);
    }

    public void getStudents() {
        for(Student student : students.values()) {
            System.out.println(student.toString());
        }
    }

    public void removeStudent(Student student) {
        this.searchStudent(student);
        students.remove(student.getId());
        System.out.printf("ID %d-yə sahib student silindi%n", student.getId());
    }

    public void getSingleStudent(Student student) {
        this.searchStudent(student);
        System.out.printf("ID %d-yə sahib student: Student{id=%d, name='%s'}", student.getId(), student.getId(), student.getName());
    }

    private void searchStudent(Student student) {
        if(!students.containsKey(student.getId())) {
            throw new StudentNotFoundException(String.format("ID %d-yə sahib student tapılmadı", student.getId()));
        }
    }
}
