package lesson10;

public class Human {
    private String name;
    private int age;
    private Pet pet;
    private Family family;


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
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    public Pet getPet() {
        return this.pet;
    }
    public void setFamily(Family family) {
        this.family = family;
    }
    public Family getFamily() {
        return this.family;
    }
}
