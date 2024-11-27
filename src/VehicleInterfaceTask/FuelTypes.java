package VehicleInterfaceTask;

public enum FuelTypes {
    BENZIN("benzin"),
    DIZEL("dizel"),
    ELEKTRIK("elektrik");

    private final String displayName;

    FuelTypes(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}