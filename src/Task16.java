import java.math.BigInteger;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        while(num != -1) {
            System.out.print("Ədəd daxil edin: ");
            num = scanner.nextInt();
            if (num == 0) {
                System.out.println("1");
            } else if (num < 0) {
                System.out.println("Yalnız müsbət ədəd (və ya sıfır) daxil edə bilərsiniz");
            } else {
                BigInteger fac = BigInteger.ONE;
                for (int i = 1; i <= num; i++) {
                    fac = fac.multiply(BigInteger.valueOf(i));
                }
                System.out.println(num + "! = " + fac);
            }
        }
    }
}
