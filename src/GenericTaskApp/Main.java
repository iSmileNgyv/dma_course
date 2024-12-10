package GenericTaskApp;

public class Main {
    public static void main(String[] args) {
        Generic<String> strG = new Generic<>("Java");
        System.out.println(strG.getValue());

        Generic<Integer> intG = new Generic<>(100);
        System.out.println(intG.getValue());
    }
}
