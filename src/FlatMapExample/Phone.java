package FlatMapExample;

public class Phone {
    private final String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return String.format("Phone number: %s", this.number);
    }
}
