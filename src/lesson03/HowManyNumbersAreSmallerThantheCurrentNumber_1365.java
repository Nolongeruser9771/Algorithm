package lesson03;

import java.util.Arrays;

public class HowManyNumbersAreSmallerThantheCurrentNumber_1365 {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        //tạo mảng mới với index bằng nums[i];
        //Mỗi nums[i] --> count[nums[i]]++;
        int n = nums.length;
        int max = 0;

        int[] count  = new int[101];

        for (int i:nums) {
            count[i]++;
        }

        //Duyệt mảng, sum(count[i]) với index < nums[i]
        int [] result = new int[n];

        for (int i = 0; i < n; i++) {
            int freqCount = 0;
            for (int j = 0; j < max+1; j++) {
                if (nums[i]>j) {
                    freqCount+=count[j];
                }
            }
            result[i] = freqCount;
        }
        return result;
    }
}
