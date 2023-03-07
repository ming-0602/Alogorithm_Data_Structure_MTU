import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr;
        int i = 0;
        while (i < nums.length-1) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr = new int[]{i, j};
                    return arr;
                }
            }
            i++;
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
        nums = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(nums,6)));
    }
}
