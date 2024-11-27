package Season;

public enum Seasons {
    SPRING(10, 27, "Yaz"),
    SUMMER(28, 45, "Yay"),
    AUTUMN(10, 30, "Payız"),
    WINTER(-11, 5, "Qış");
    private final double minTemp;
    private final String description;
    private final double maxTemp;
    Seasons(double minTemp, double maxTemp, String description) {
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.description = description;
    }
    public double getMinTemp() {
        return this.minTemp;
    }
    public String getDescription() {
        return this.description;
    }
    public double getMaxTemp() {
        return this.maxTemp;
    }

    public String getFormatInfo() {
        return this.description + " fəslində minimum temperatur: " + this.minTemp + " və maksimum temperatur: " + this.maxTemp + " dərəcə olur";
    }
}
