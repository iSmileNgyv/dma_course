package FlatMapExample;

import java.util.ArrayList;

public class Person {
    private String name;
    private final ArrayList<Phone> phones = new ArrayList<>();
    public Person() {}
    public Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addPhone(Phone phone){
        phones.add(phone);
        phone.setPerson(this);
    }

    public ArrayList<Phone> getPhones() {
        return this.phones;
    }
}
