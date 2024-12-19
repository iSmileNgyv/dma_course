import java.util.function.Predicate;
import java.util.stream.Stream;
public class StreamExample3 {
    public static <T> void printFilteredElements(T[] array, Predicate<T> condition) {
        Stream.of(array)
                .filter(condition)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 15, 20, 25, 2, 8};
        System.out.println("Filtered Integers (greater than 10):");
        printFilteredElements(intArray, n -> n > 10);

        String[] stringArray = {"Ismayil", "Elchin", "Ismayil12345", "ismayil12"};
        System.out.println("Filtered Strings (containing 'Ismayil'):");
        printFilteredElements(stringArray, s -> s.contains("Ismayil"));

        Double[] doubleArray = {45.5, 60.0, 32.2, 80.1, 50.0};
        System.out.println("Filtered Doubles (less than 50.0):");
        printFilteredElements(doubleArray, d -> d < 50.0);
    }
}
