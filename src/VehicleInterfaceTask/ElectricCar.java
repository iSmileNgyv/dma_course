package VehicleInterfaceTask;

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
    public String getFuelType() {
        return "Elektrik";
    }
}
