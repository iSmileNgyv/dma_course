public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int num = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > num) {
                num = nums[i];
            }
        }
        System.out.println(num);
    }
}