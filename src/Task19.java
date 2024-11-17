import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);
        int cnt = nums.length;
        for (int i = 0; i < cnt; i++) {
            int num = scanner.nextInt();
            nums[i] = num;
        }
        int sum = 0;
        for(int i = 0; i < cnt; i++) {
            sum += nums[i];
        }
        double average = sum / nums.length;
        System.out.println("Sum: " + sum + "\nAverage: " + average);
    }
}
