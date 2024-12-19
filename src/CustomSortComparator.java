import java.util.Comparator;

public class CustomSortComparator {
    public  static Comparator<CustomSort> comparatorForName() {
        return (o1, o2) -> o1.getName().compareTo(o2.getName());
    }

    public static Comparator<CustomSort> comparatorForAge() {
        return Comparator.comparing(o -> (o.getName() + o.getAge()));
    }
}
