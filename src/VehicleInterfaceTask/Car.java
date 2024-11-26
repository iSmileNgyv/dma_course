package VehicleInterfaceTask;

import BankAccountApp.FuelTypes;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Maşının mühərriki işə düşdü");
    }

    @Override
    public void stopEngine() {
        System.out.println("Maşının mühərriki söndürüldü");
    }

    @Override
    public FuelTypes getFuelType() {
        return FuelTypes.BENZIN;
    }
}
