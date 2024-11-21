package StudentApp;

public class Student extends Academy {
    private int studentId;
    private String course;
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public Student(int studentId, String course) {
        this.studentId = studentId;
        this.course = course;
    }
    public Student() {}
    public Student(int studentId, String course, String academyName, String address) {
        super(academyName, address);
        this.studentId = studentId;
        this.course = course;
    }
    public void study() {
        System.out.println(this.studentId + " nömrəli tələbə " + super.getAcademyName() + " akademiyada " +  this.course + " dərsi alır");
    }
}
