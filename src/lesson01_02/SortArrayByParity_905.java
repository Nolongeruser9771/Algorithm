package lesson01_02;

import java.util.Arrays;

public class SortArrayByParity_905 {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int i = 0; //cận trái
        int j = nums.length-1; // cận phải

        //set cận trái, phải -> kiểm tra even ở bên trái, odd ở bên phải
        //nếu có giá trị không đúng vị trí thì đổi chỗ
        while (i<j) {
            if (nums[i]%2!=0 && nums[j]%2 ==0) {
                //Đổi chỗ
                int tempt = nums[i];
                nums[i] = nums[j];
                nums[j] = tempt;

                i++;
                j--;
            }
            if (nums[i]%2==0) i++;
            if (nums[j]%2!=0) j--;
        }
        return nums;
    }
}
