package EnumExample;

public enum TrafficLights {
    RED("Dayan"),
    YELLOW("Hazırlaş"),
    GREEN("Keç");
    private final String value;
    TrafficLights(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }
}
