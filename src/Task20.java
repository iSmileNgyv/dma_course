import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        int[] sums = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < sums.length; i++) {
            sums[i] = scanner.nextInt();
        }
        System.out.print("Enter a number to count: ");
        int num = scanner.nextInt();
        int cnt = 0;
        for(int i = 0; i < sums.length; i++) {
            if(num == sums[i]) {
                cnt++;
            }
        }
        System.out.println("The number " + num + " appears " + cnt + " times.");
    }
}
