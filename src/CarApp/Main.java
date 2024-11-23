package CarApp;

public class Main {
    public static void main(String[] args) {
        var mercedes = new Mercedes();
        mercedes.setEngineType(mercedes.ELECTRIC);
        mercedes.setModel("EQB 250");
        mercedes.setMaxSpeed(200);
        mercedes.displayInfo();

        var bmw = new BMW("X7");
        bmw.setEngineType(mercedes.Hybrid);
        bmw.setEngineDisplacament(3000);
        bmw.setMaxSpeed(280);
        bmw.displayInfo();
    }
}
