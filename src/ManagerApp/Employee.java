package ManagerApp;

public class Employee implements Operation{
    private int no;
    private String name;
    private int year;
    private String department;
    private double bonus = 0;
    private static final int BASE_SALARY = 500;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println(this.name + " " + this.department + " - də " + this.year + " ildir ki işləyir\nBonuslarla birgə aylıq gəliri: " + this.calculateSalary());
    }

    @Override
    public double calculateSalary() {
        return BASE_SALARY * this.year + this.bonus;
    }
}
