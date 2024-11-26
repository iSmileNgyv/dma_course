package VehicleInterfaceTask;

import BankAccountApp.FuelTypes;

public class ElectricCar implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Elektrik mühərrik işə düşdü");
    }

    @Override
    public void stopEngine() {
        System.out.println("Elektrik mühərrik söndürüldü");
    }

    @Override
    public FuelTypes getFuelType() {
        return FuelTypes.ELEKTRIK;
    }
}
