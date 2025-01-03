package HashsetTaskApp;

public class Main {
    public static void main(String[] args) {
        var operation = new Operation();
        String errorMessage = "";
        try {
            var emin = new Student(4, "Emin");
            operation.addStudent(new Student(1, "Ilkin"));
            operation.addStudent(new Student(2, "Xan"));
            operation.addStudent(new Student(3, "Elnur"));
            operation.addStudent(new Student(3, "Elnur"));
            operation.addStudent(emin);
            operation.addStudent(new Student(5, "Musa"));
            operation.addStudent(new Student(6, "Huseyn"));
            operation.addStudent(new Student(7, "Tofiq"));

            operation.searchStudent(1);
            operation.searchStudent(emin);
        }catch(Exception e) {
            errorMessage = e.getMessage();
        } finally {
            operation.showLogs();
            System.err.println(errorMessage);
        }

    }
}
