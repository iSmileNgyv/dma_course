import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        String res = "";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
            if(i == nums.length - 1){
                res += nums[i];
            } else {
                res += nums[i] + ",";
            }

        }
        System.out.println(res);


    }
}
