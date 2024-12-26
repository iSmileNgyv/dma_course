package FlatMapExample;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        var phone1 = new Phone("0505555555");
        var phone2 = new Phone("0555555555");
        var phone3 = new Phone("0705555555");

        var person1 = new Person("İsmayıl");
        person1.addPhone(phone1);
        person1.addPhone(phone2);

        var person2 = new Person("Həştərxan");
        person2.addPhone(phone3);

        List<Person> people = Arrays.asList(person1, person2);

        people.stream()
                .flatMap(person -> person.getPhones().stream())
                .map(phone -> phone.getPerson().getName() + ": " + phone.getNumber())
                .forEach(System.out::println);
    }
}