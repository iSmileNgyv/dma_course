package FreeTaskStreamAPI;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Ismayil", 30),
                new Person("Kenan", 20),
                new Person("Elchin", 25),
                new Person("Yusif", 35)
        );

        List<String> namesOfOlderPersons = persons.stream()
                .filter(person -> person.getAge() > 25)
                .map(Person::getName)
                .toList();

        System.out.println("Older than 25: " + namesOfOlderPersons);

        List<Person> sortedByAge = persons.stream()
                .sorted(Comparator.comparingInt(Person::getAge))
                .toList();

        System.out.println("Sorted by age: " + sortedByAge);
    }
}