package StudentApp;

public class Main {
    public static void main(String[] args) {
        var student = new Student(1, "İnformasiya Texnologiyaları", "BMU", "Xırdalan");
        student.displayInfo();
        student.study();
        var teacher = new Teacher(5, "İnformasiya Texnologiyaları", "BMU", "Xırdalan");
        teacher.teach();
        // həm teacher ilə həm də student - də displayInfo() istifadə edə bilərik extends edib constructor da dataları set etdiyim üçün ayrıca Academy obyekti yaratmağa ehtiyac yoxdu
    }
}
