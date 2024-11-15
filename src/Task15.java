import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sum = 0;
        while(true) {
            System.out.print("Ədəd daxil edin: ");
            int num = scanner.nextInt();
            if(num == 0)
                break;
            sum += num;
        }
        System.out.println("Ümumi məbləğ: " + sum);
    }
}
