package VehicleInterfaceTask;

import BankAccountApp.FuelTypes;

public interface Vehicle {
    void startEngine();
    void stopEngine();
    FuelTypes getFuelType();
}
