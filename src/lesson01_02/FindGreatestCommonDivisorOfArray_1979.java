package lesson01_02;

public class FindGreatestCommonDivisorOfArray_1979 {
    public static void main(String[] args) {
        int[] nums = {31,36,35,18,30,8};
        System.out.println(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        //B1: Duyệt mảng -> Tìm Min, Max
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
        //B2: Tìm GCD của Min, Max
        if (max % min == 0) {
            return min;
        }
        int maxi = 1;
        for (int i = 2; i <= min; i++) {

            if ((min % i == 0) && (max % i == 0)) {
                if (i > maxi) {
                    maxi = i;
                }
            }
        }
        return maxi;
    }
}
