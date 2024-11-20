import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(ReverseName(name));
    }

    public static String ReverseName(String name) {
        StringBuilder reverse = new StringBuilder();
        for(int i = name.length() - 1; i >= 0; i--) {
            reverse.append(name.charAt(i));
        }
        return reverse.toString();
    }
}
