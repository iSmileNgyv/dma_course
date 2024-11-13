import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 4 == 0 && num % 6 == 0) {
            System.out.println(num + " 4-ə və 6-ya qalıqsız bölünür");
        } else {
            System.out.println(num + " 4 və 6-ya qalıqsız bölünmür");
        }
    }
}
