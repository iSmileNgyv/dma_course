package ManagerApp;

public class Main {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.setBonus(100);
        manager.setNo(1);
        manager.setName("Ismayil");
        manager.setDepartment("IT");
        manager.setYear(1);
        manager.setDepartmentManaged("IT");
        manager.work();

        var director = new Director();
        director.setBonus(1000);
        director.setNo(2);
        director.setName("Ismayil");
        director.setDepartment("IT");
        director.setYear(2);
        director.work();
    }
}
