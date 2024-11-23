package CarApp;

public class Car {
    public final String ELECTRIC = "Electric";
    public final String Hybrid = "Hybrid";
    private String engineType;
    private int engineDisplacament; //3000, 2000, 0(electric)
    private int maxSpeed;
    public Car() {}
    public Car(String engineType, int engineDisplacament, int maxSpeed) {
        this.engineType = engineType;
        this.engineDisplacament = engineDisplacament;
    }
    public Car(String engineType, int maxSpeed) { //for electric
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.engineDisplacament = 0;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getEngineDisplacament() {
        return engineDisplacament;
    }

    public void setEngineDisplacament(int engineDisplacament) {
        this.engineDisplacament = engineDisplacament;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String setDisplayInfoText() {
        String displayInfoText = "Engine Type: " + this.engineType + "\n";
        displayInfoText += "Engine Displacement: " + this.engineDisplacament + "\n";
        displayInfoText += "Max Speed: " + this.maxSpeed + "\n";
        return displayInfoText;
    }
}
