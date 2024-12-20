import java.util.function.Predicate;
import java.util.stream.Stream;
public class StreamExample3 {
    public static <T> void filterElement(T[] array, Predicate<T> condition) {
        Stream.of(array)
                .filter(condition)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 15, 20, 25, 2, 8};
        filterElement(intArray, n -> n > 10);
        System.out.println();
        String[] stringArray = {"Ismayil", "Elchin", "Ismayil12345", "ismayil12"};
        filterElement(stringArray, s -> s.contains("Ismayil"));
        System.out.println();
        Double[] doubleArray = {45.5, 60.0, 32.2, 80.1, 50.0};
        filterElement(doubleArray, d -> d < 50.0);
    }
}
