package CarApp;

public class BMW extends Car{
    private String model;
    public BMW() {}
    public BMW(String model) {
        this.model = model;
    }
    public BMW(String model, String engineType, int engineDisplacament, int maxSpeed) {
        super(engineType, engineDisplacament, maxSpeed);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String setDisplayInfoText() {
        String text = "Model: " + this.model + "\n";
        text += super.setDisplayInfoText();
        return text;
    }

    public void displayInfo() {
        System.out.println(this.setDisplayInfoText());
    }
}
