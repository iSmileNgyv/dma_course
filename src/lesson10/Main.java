package lesson10;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Pet pet = new Pet();
        pet.setName("Mestan");
        human.setPet(pet);
    }
}
