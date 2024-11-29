package Season;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        try {
            if(input == null || input.trim().isEmpty()) {
                throw new NullPointerException();
            }
            System.out.println("Text is: " + input);
        } catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
