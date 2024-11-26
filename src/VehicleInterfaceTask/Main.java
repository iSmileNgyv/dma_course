package VehicleInterfaceTask;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();
        Bike bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
    }
}
