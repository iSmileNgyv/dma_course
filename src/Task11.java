import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İki rəqəmli ədəd daxil edin: ");
        int num = scanner.nextInt();
        if (num >= 10 && num <= 99) {
            int onlar = num / 10;
            int birler = num % 10;
            System.out.print(onlar + " " + birler);
        } else {
            System.out.println("Yalnız 10 ilə 99 arasında ədəd daxil edin.");
        }
    }
}
