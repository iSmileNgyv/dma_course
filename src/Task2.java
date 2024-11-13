import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num % 3 == 0 || num % 4 == 0) {
            System.out.println(num + " 3-ə və ya 4-ə qalıqsız bölünür");
        } else {
            System.out.println(num + " 3-ə və ya 4-ə qalıqsız bölünmür");
        }
    }
}
