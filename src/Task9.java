import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İli daxil edin: ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Uzun ildir");
                } else {
                    System.out.println("Uzun il deyil");
                }
            } else {
                System.out.println("Uzun ildir");
            }
        } else {
            System.out.println("Uzun il deyil");
        }
    }
}
