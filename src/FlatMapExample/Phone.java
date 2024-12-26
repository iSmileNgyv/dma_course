package FlatMapExample;

public class Phone {
    private final String number;
    private Person person;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return String.format("Phone number: %s\nPerson: %s", this.number, this.person.getName());
    }
}
