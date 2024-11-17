import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < nums.length; i++) {
            int num = scanner.nextInt();
            nums[i] = num;
        }

        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Minimum: " + min + "\nMaksimum: " + max);

    }
}
