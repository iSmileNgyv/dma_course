package VehicleInterfaceTask;

import BankAccountApp.FuelTypes;

public class Bike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Velosipedin mühərriki işə düşdü");
    }

    @Override
    public void stopEngine() {
        System.out.println("Velosipedin mühərriki söndürüldü");
    }

    @Override
    public FuelTypes getFuelType() {
        return FuelTypes.ELEKTRIK;
    }
}
