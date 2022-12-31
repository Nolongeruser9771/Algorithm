package lesson06;

import java.util.Arrays;

public class QuickSort_Implement {
    public static void main(String[] args) {
        int[] nums = {5,1,4,3,2};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        return quickSort(nums,0,n-1);
    }

    public static int[] quickSort(int[] nums, int start, int end) {
        if (start>=end) return nums;
        int mid = (start+end)/2;
        int key = nums[mid];
        int i = start;
        int j = end;
        while (i<=j) {
            while (nums[i]<key) i++;
            while (nums[j]>key) j--;
            if (i<=j) {
                int tempt = nums[i];
                nums[i] = nums[j];
                nums[j] = tempt;

                i++;
                j--;
            }
        }
        quickSort(nums,start, j);
        quickSort(nums, i, end);
        return nums;
    }
}
