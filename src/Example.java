public enum Example {
    RED("red;");
    private final String value;
    Example(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
