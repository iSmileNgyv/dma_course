package lesson10;

import java.util.Arrays;

public class Family{
    private Human mother;
    private Human father;
    private int childrenCount = 0;
    private int petCount = 0;
    private Human[] children = new Human[10];
    private Pet[] pet = new Pet[100];
    public int getChildrenCount() {
        return childrenCount;
    }
    public int getPetCount() {
        return petCount;
    }
    public Human[] getChildren() {
        return children;
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }
    public Human getMother() {
        return mother;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public Human getFather() {
        return father;
    }

    public void setPet(Pet[] pet) {
        this.pet = pet;
    }
    public Pet[] getPet() {
        return pet;
    }


    public void addChild(Human child) {
        this.children[childrenCount] = child;
        this.childrenCount++;
    }

    public void addPet(Pet pet) {
        this.pet[petCount] = pet;
        this.petCount++;
    }

    public String info() {
        String result =  "Ailə tərkibi: \n" +
                "Ana: " + this.mother.getName() + " " + " yaş: " + this.mother.getAge() +
                "\nAta: " + this.father.getName() + " yaş: " + this.father.getAge() + "\n";
        if(this.childrenCount > 0) {
            result += this.childrenCount + " uşaq var: \n";
            for(int i = 0; i < childrenCount; i++) {
                result += (i + 1) + ". " + this.children[i].getName() +
                        " yaşı: " + this.children[i].getAge() + "\n";
            }
        } else {
            result += "Ailədə uşaq yoxdur";
        }

        if(this.petCount > 0) {
            result += this.petCount + " ev heyvanı var: \n";
            for(int i = 0; i < petCount; i++) {
                result += (i + 1) + ". " + this.pet[i].getName() +
                " yaşı: " + this.pet[i].getAge() +
                " rəngi: " + this.pet[i].getColor() + "\n";
            }
        } else {
            result += "Ailədə ev heyvanı yoxdur";
        }
        return result;
    }

}
