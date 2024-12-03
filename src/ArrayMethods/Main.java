package ArrayMethods;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 6, 10, 0};
        // Sorting
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        // min and max
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Max: " + max + " Min: " + min);

        // String alphabetic sorting
        String[] words = {"Sumqayit", "Ganja", "Baku"};
        Arrays.sort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // Sum and Average of Array Elements
        var sum = Arrays.stream(numbers).sum();
        var cnt = Arrays.stream(numbers).count();
        System.out.println("Sum: " + sum + " Average: " + (double) sum / cnt);

        // Reverse the Array
        int[] numbersForReverse = {1, 2, 3, 6, 10, 0};
        for(int i = numbersForReverse.length - 1; i >= 0; i--) {
            System.out.print(numbersForReverse[i] + " ");
        }

    }
}
