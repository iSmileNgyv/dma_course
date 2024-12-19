import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class CustomSort implements Comparator<CustomSort> {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomSort{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(CustomSort o1, CustomSort o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
