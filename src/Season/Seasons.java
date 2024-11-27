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
        String formattedStr = "%s fəslində minimum temperatur: %.2f, maximum temperatur: %.2f dərəcə olur";
        return String.format(formattedStr, this.getDescription(), this.getMinTemp(), this.getMaxTemp());
    }
}
