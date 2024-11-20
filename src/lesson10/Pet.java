package lesson10;

public class Pet {
    private String name;
    private int age;
    private String color;

    public Pet() {}
    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return this.age;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return this.color;
    }
}
