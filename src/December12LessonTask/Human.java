package December12LessonTask;

import java.time.LocalDate;

public class Human {
    private String name;
    private int age;
    private LocalDate birthDate;

    public Human() {}
    public Human(String name, int age, LocalDate birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Human{name=%s, age=%d, birthDate=%s}".formatted(this.name, this.age, this.birthDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Human human = (Human) obj;
        return this.name.equals(human.name) && this.age == human.age && this.birthDate.equals(human.birthDate);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age + this.birthDate.hashCode();
    }
}
