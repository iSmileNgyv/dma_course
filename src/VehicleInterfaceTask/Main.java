package VehicleInterfaceTask;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();
        System.out.println("Mühərrik tipi: " + car.getFuelType());

        Bike bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
        System.out.println("Mühərrik tipi: " + bike.getFuelType());

        var electricCar = new ElectricCar();
        electricCar.startEngine();
        electricCar.stopEngine();
        System.out.println("Mühərrik tipi: " + electricCar.getFuelType());
    }
}
