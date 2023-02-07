package lesson01_02;

import java.util.Arrays;

public class MoveZeroes_283 {
    public static void main(String[] args) {
        int[] nums = {0,0,1};
        System.out.println(Arrays.toString(moveZeroes(nums)));
        moveZeroes();
    }
    //Dùng mảng phụ
    public static void moveZeroes() {
        int[] nums = {0,1,0,3,12};
        int n = nums.length;
        int[] zeroRemoves = new int[n];

        //nếu nums[i]!=0  -> add vào zeroRemoves;
        int i = 0;
        int j = 0;
        while (i<n) {
            if (nums[i]!=0) {
                zeroRemoves[j] = nums[i];
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(zeroRemoves));
    }

    //Đổi giá trị in-place
    public static int[] moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;

        //Dồn phần tử khác 0 lên đầu
        for (int i = 0; i < n; i++) {
            if (nums[i]!=0) {
                nums[count++] = nums[i];
            }
        }
        //Phần tử cuối dãy bằng 0
        for (int i = count; i < n; i++) {
            nums[i] = 0;
        }
        return nums;
    }
}
