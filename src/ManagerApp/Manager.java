package ManagerApp;

public class Manager extends Employee{
    private String departmentManaged;
    protected static final int MANAGEMENT_PAYMENT = 5000;

    public String getDepartmentManaged() {
        return departmentManaged;
    }

    public void setDepartmentManaged(String departmentManaged) {
        this.departmentManaged = departmentManaged;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (MANAGEMENT_PAYMENT * this.getYear());
    }
}
