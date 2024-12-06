package StudentMapApp;

public class Main {
    public static void main(String[] args) {
        String errorMessage = null;
        var operation = new Operation();
        try {
            var student = new Student();
            student.setId(1);
            student.setName("Alice");

            var student2 = new Student();
            student2.setId(2);
            student2.setName("Bob");

            var student3 = new Student();
            student3.setId(3);
            student3.setName("Charlie");

            operation.addStudent(student);
            operation.addStudent(student2);
            //operation.addStudent(student2);
            operation.removeStudent(student2);
            operation.addStudent(student3);
        } catch (Exception e) {
            errorMessage = e.getMessage();
        } finally {
            operation.getStudents();
        }
        if(errorMessage != null && !errorMessage.isEmpty()) {
            System.err.println(errorMessage);
        }

    }
}
