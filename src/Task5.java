import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci ədəd daxil edin: ");
        double num1 = scanner.nextDouble();
        System.out.print("İkinci ədəd daxil edin: ");
        double num2 = scanner.nextDouble();
        System.out.print("Operatoru(+, -, *, /) daxil edin: ");
        String operator = scanner.next();
        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        } else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println(num1 / num2);
        }
    }
}
