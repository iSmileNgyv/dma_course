import java.util.*;
import java.util.stream.Collectors;
public class StreamExample4 {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Ismayil", "Java", "ATL");
        List<List<String>> result = strList.stream()
                .map(s -> Arrays.stream(s.split("")).collect(Collectors.toList()))
                .toList();
        System.out.println(result);
    }
}
