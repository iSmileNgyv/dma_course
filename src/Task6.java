import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = scanner.nextDouble();
        int perc = 5;
        if(money > 300 && money < 500) {
            perc = 7;
        } else if (money > 500 && money < 1000) {
            perc = 10;
        } else if(money > 1000){
            perc = 15;
        }
        System.out.println("Ödəyəcəyiniz məbləğ: " + (money - (money * perc / 100)) + " azn");
    }
}
