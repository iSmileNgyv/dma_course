package ManagerApp;

import static ManagerApp.Manager.MANAGEMENT_PAYMENT;

public class Director extends Employee{
    private static final int BASE_SALARY = 7000;

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + (BASE_SALARY * this.getYear()) + (MANAGEMENT_PAYMENT * this.getYear());
    }
}
