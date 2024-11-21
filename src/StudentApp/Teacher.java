package StudentApp;

public class Teacher extends Academy {
    private int teacherId;
    private String subject;

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }
    public Teacher(int teacherId, String subject) {
        this.teacherId = teacherId;
        this.subject = subject;
    }
    public Teacher(int teacherId, String subject, String academyName, String address) {
        super(academyName, address);
        this.teacherId = teacherId;
        this.subject = subject;
    }
    public Teacher() {}
    public void teach() {
        System.out.println(this.teacherId + " nömrəli müəllim " + super.getAcademyName() + " akademiyada " + this.subject + " dərsi keçir");
    }
}
