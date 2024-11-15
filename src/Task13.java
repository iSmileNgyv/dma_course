import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        long tekCem = 0;
        int tekSay = 0;
        long cutCem = 0;
        int cutSay = 0;
        for(int i = num1; i <= num2; i++) {
            if (i % 2 == 1) {
                tekCem+=i;
                tekSay++;
            } else {
                cutCem+=i;
                cutSay++;
            }
        }
        System.out.println("Tək ədədlərin sayı: " + tekSay + "\nTək ədədlərin cəmi: " + tekCem + "\n" +
                "Cüt ədədlərin sayı: " + cutSay + "\nCüt ədədlərin cəmi: " + cutCem);
    }
}
