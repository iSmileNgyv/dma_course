package NewsApp;

public class Author<T> {
    private T firstName;
    private T lastName;

    public Author(T firstName, T lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public T getFirstName() {
        return firstName;
    }

    public T getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
