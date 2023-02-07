package mid_term_test;

import java.util.Arrays;

public class SortColor_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }

    public static int[] sortColors(int[] nums) {
        //B1. Chọn khoá và biên
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        //B2. ĐK: mid ở bên trái right
        while (mid<=right) {
            int key = nums[mid]; //Chỉ có thể bằng 0,1,2
            switch (key) {
                case 0:
                    //giá trị 0 phải ở bên trái
                    int t1 = nums[left];
                    nums[left] = key;
                    nums[mid] = t1;
                    left++;
                    mid++;
                    break;

                case 1:
                    //Giá trị 1 ở giữa
                    mid++;
                    break;

                case 2:
                    //Giá trị 2 phải ở bên phải
                    int t2 = nums[right];
                    nums[right] = key;
                    nums[mid] = t2;
                    right--;
                    break;
            }
        }
        return nums;
    }
}
