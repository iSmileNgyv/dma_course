package StudentApp;

public class Academy {
    private String address;
    private String academyName;
    public String getAcademyName() {
        return academyName;
    }
    public void setAcademyName(String academyName) {
        this.academyName = academyName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public Academy(String academyName, String address) {
        this.academyName = academyName;
        this.address = address;
    }
    public Academy() {}
    public void displayInfo() {
        if(this.academyName == null || this.address == null) {
            System.out.println("Akademiya adı və adres yazılmalıdı");
        } else {
            System.out.println("Akademiya adı: " + this.academyName + "\nAdres: " + this.address);
        }

    }
}
