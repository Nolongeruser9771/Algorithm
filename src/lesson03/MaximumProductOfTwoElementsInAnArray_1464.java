package lesson03;

public class MaximumProductOfTwoElementsInAnArray_1464 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(maxProduct(nums));
        System.out.println(maxProduct1(nums));
    }
    //C1
    public static int maxProduct(int[] nums) {
        int maxCal =0;
        int cal =0;
        int n = nums.length;
        if (nums.length==2) {
            return (nums[0]-1)*(nums[1]-1);
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                cal = (nums[i]-1)*(nums[j]-1);
                if (maxCal<cal) {
                    maxCal=cal;
                }
            }
        }
        return maxCal;
    }

    //C2
    public static int maxProduct1(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i]>max1) {
                max2=max1;
                max1=nums[i];
            } else if (nums[i]>max2) {
                max2=nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}
