package HashsetTaskApp;

import HashsetTaskApp.Exceptions.StudentNotFoundException;
import HashsetTaskApp.Exceptions.WrongOperationException;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Operation {
    private final HashSet<Student> students = new HashSet<>();
    private final HashMap<Student, List<String>> log = new HashMap<>();

    public void addStudent(Student student) {
        this.errorIsExist(student);
        this.students.add(student);
        this.addLog(student, "add");
    }

    public void removeStudent(Student student) {
        this.errorNotExist(student);
        this.students.remove(student);
        this.addLog(student, "remove");
    }

    private void errorIsExist(Student student) {
        if(this.students.contains(student)) {
            throw new StudentNotFoundException(String.format("Student with id %d not found", student.getId()));
        }
    }

    private void errorNotExist(Student student) {
        if(!this.students.contains(student)) {
            throw new StudentNotFoundException(String.format("Student with id %d already exist", student.getId()));
        }
    }

    public void searchStudent(Student student) {
        this.errorNotExist(student);
        this.addLog(student, "search");
    }

    public void searchStudent(int id) {
        for(Student s : this.students) {
            if(s.getId() == id) {
                this.searchStudent(s);
                return;
            }
        }
        throw new StudentNotFoundException(String.format("Student with id %d not found", id));
    }

    private void addLog(Student student, String operation) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = now.format(formatter);
        String logEntry = switch (operation.toLowerCase()) {
            case "add" -> String.format("Student added: Student{name='%s', id=%d}", student.getName(), student.getId());
            case "search" -> String.format("Found: Student{name='%s', id=%d}", student.getName(), student.getId());
            case "remove" -> String.format("Student removed: Student{name='%s', id=%d}", student.getName(), student.getId());
            default -> throw new WrongOperationException("Yanlış əməliyyat");
        };
        this.log.computeIfAbsent(student, k -> new ArrayList<>()).add(logEntry);
    }

    public void showLogs(Student student) {
        List<String> logs = this.log.get(student);
        if (logs != null) {
            logs.forEach(System.out::println);
        }
    }

    public void showLogs() {
        this.log.forEach((student, logs) -> {
            logs.forEach(System.out::println);
        });
    }
}
