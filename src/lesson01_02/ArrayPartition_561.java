package lesson01_02;

import java.util.Arrays;

public class ArrayPartition_561 {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        //Sort dãy tăng dần -> Cộng các giá trị INDEX chẵn (cho bước nhảy của i là 2)
        //Trong 2 cặp số, thì các cặp có giá trị liền nhau có mi là cao hơn
        Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i+=2) {
            maxSum += nums[i];
        }
        return maxSum;
    }
}
