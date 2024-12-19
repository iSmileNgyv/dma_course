import java.util.*;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange", "Kiwi", "Pineapple", "Pear"));
        List<String> filteredAndSorted = stringSet.stream()
                .filter(s -> s.length() >= 5)
                .sorted()
                .toList();

        filteredAndSorted.forEach(System.out::println);
    }
}