import java.util.*;
public class StreamExample2 {
    public static void main(String[] args) {
        LinkedList<Integer> numberList = new LinkedList<>(Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45));

        List<Integer> result = numberList.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .filter(n -> n > 20)
                .sorted()
                .toList();

        result.forEach(System.out::println);
    }
}