package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var binarySearch = new BinarySearch(new ArrayList<>(Arrays.asList(1, 2, 3, 0, 10, -1)));
        // -1 0 1 2 3 10
        binarySearch.binarySearch(10);
        System.out.println(binarySearch);
    }
}
