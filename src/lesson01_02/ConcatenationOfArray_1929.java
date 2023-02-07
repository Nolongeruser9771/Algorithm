package lesson01_02;

import java.util.Arrays;

public class ConcatenationOfArray_1929 {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
//        System.out.println(Arrays.toString(getConcatenation(nums)));
        System.out.println(Arrays.toString(getConcatenation2(nums)));
    }

    //Sử dụng 2 con trỏ
    public static int[] getConcatenation(int[] nums) {
    //B1: Tạo mảng length = 2n
        int n = nums.length;
        int[] ans = new int[2*n];
        int i = 0;
        int j = 0;
        //B2: i trỏ vào mảng ans: 0 -> 2n-1, j trỏ vào mảng nums: 0 -> n-1
        while (i<=(2*n-1)) {
            if (i==n) {
                j=0;
            }
            ans[i] = nums[j];
            i++;
            j++;
        }
        return ans;
    }

    //Sử dụng Array.copyOf  --  copyOf(int[] original, int newLength)
    public static int[] getConcatenation2(int[] nums) {
        int n = nums.length;
        int[] ans = Arrays.copyOf(nums, 2*n);
        System.arraycopy(nums,0,ans,n,n);
        return ans;
    }
}