package lesson10;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();
        family.setMother(new Human("Nazile", 40));
        family.setFather(new Human("Natiq", 50));
        family.addChild(new Human("Ismayil", 24));
        family.addChild(new Human("Yusif", 16));
        family.addPet(new Pet("Toplan", 2, "qara"));
        family.addPet(new Pet("Mesdan", 2, "ağ"));
        System.out.println(family.info());
    }

}
