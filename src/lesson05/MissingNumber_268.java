package lesson05;

public class MissingNumber_268 {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber1(nums));
        System.out.println(missingNumber2(nums));
    }
    //Sort tăng dần -> BSearch
    public static int missingNumber1(int[] nums) {
        //Sort
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i && nums[i] <= nums.length - 1) {
                swap(nums, i, nums[i]);
            }
        }
        //Find missing number
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }

    public static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    //Hiệu số 2 sum: (Sum từ 1 -> n) - Sum của dãy nums
    public static int missingNumber2(int[] nums) {
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
        }
        int i = nums.length*(nums.length+1)/2 - s;
        return i;
    }
}
