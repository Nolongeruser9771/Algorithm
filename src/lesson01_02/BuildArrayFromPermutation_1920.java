package lesson01_02;

import java.util.Arrays;

public class BuildArrayFromPermutation_1920 {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
//        System.out.println(Arrays.toString(buildArray(nums)));
        System.out.println(Arrays.toString(buildArray1(nums)));
    }

    //Dùng vòng lặp
    public static int[] buildArray(int[] nums) {
    //B1: Tạo mảng ans = [nums.length];
        int n = nums.length;
        int[] ans = new int[n];
        //ans[i] = nums[nums[i]]    i: 0-> nums.length-1
        for (int i = 0; i <= n-1; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    //Dùng đệ quy
    public static int[] buildArray1(int[] nums) {
        cur(nums, 0);
        return nums;
    }

    public static void cur(int[] nums, int start) {
        if (start < nums.length) {
            int temp = nums[start];
            int result = nums[temp]; //Lưu giá trị nums[nums[start]]; start 0-> n-1
            cur(nums, start + 1);
            nums[start] = result;    //Trả giá trị n-1 -> 0
        }
    }
}
