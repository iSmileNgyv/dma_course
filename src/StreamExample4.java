import java.util.*;
import java.util.stream.Collectors;
public class StreamExample4 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Ismayil", "Java", "ATL");
        var result = strList.stream()
                .map(s -> Arrays.stream(s.split(""))
                .collect(Collectors.toList()))
                .flatMap(Collection::stream)
                .toList();
        System.out.println(result);
    }
}
