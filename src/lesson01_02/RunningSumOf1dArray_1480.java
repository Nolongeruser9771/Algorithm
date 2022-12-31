package lesson01_02;

import java.util.Arrays;

public class RunningSumOf1dArray_1480 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    //Dùng vòng lặp
    public static int[] runningSum(int[] nums) {
    //runningSum[i] = sum(nums[0]…nums[i])
        int n = nums.length;
        int[] runningSum = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum+=nums[i];
            runningSum[i] = sum;
        }
        return runningSum;
    }

    //Hôm nào rảnh thử dùng đệ quy xem sao...
}
