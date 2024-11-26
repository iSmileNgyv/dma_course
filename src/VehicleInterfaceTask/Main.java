package VehicleInterfaceTask;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();
        System.out.println("Mühərrik tipi: " + car.getFuelType().substring(0, 1).toUpperCase() + car.getFuelType().substring(1));

        Bike bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
        System.out.println("Mühərrik tipi: " + bike.getFuelType().substring(0, 1).toUpperCase() + bike.getFuelType().substring(1));

        var electricCar = new ElectricCar();
        electricCar.startEngine();
        electricCar.stopEngine();
        System.out.println("Mühərrik tipi: " + electricCar.getFuelType().substring(0, 1).toUpperCase() + electricCar.getFuelType().substring(1));



        Car car2 = new Car();
        car2.startCar();
    }
}
