package VehicleInterfaceTask;

import BankAccountApp.FuelTypes;

public class Car implements Vehicle {
    private boolean hasFuel = false;

    public boolean checkFuel() {
        return this.hasFuel;
    }

    public void startCar() {
        if(checkFuel()) {
            this.startEngine();
        }
        else {
            System.out.println("Yanacaq olmadığına görə mühərrik işə düşə bilmədi");
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Maşının mühərriki işə düşdü");
    }

    @Override
    public void stopEngine() {
        System.out.println("Maşının mühərriki söndürüldü");
    }

    @Override
    public String getFuelType() {
        return FuelTypes.BENZIN.getDisplayName();
    }
}
