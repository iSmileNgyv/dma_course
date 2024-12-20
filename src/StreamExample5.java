import java.util.Arrays;
import java.util.List;
public class StreamExample5 {
    public static void main(String[] args) {
        var list = Arrays.asList(
                Arrays.asList(10, 20, 30),
                Arrays.asList(40, 50, 60),
                Arrays.asList(70, 80, 90)
        );

        list.stream()
                .map(l -> "List: " + l)
                .forEach(System.out::println);
    }
}
