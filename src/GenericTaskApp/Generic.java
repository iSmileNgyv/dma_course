package GenericTaskApp;

public class Generic<T> {
    private final T value;
    public Generic(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
