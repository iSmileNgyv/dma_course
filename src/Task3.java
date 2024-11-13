import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        /*
        x - 50 = F
        51-60 = E
        61-70 = D
        71-80 = C
        81-90 = B
        91-100 = A
         */
        if(num <= 50) {
            System.out.println("F");
        } else if (num <= 60) {
            System.out.println("E");
        } else if (num <= 70) {
            System.out.println("D");
        } else if (num <= 80) {
            System.out.println("C");
        } else if (num <= 90) {
            System.out.println("B");
        } else if (num <= 100) {
            System.out.println("A");
        }
    }
}
