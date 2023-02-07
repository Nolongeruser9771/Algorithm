package lesson05;

public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {
        return bSearch(nums,target,0,nums.length-1);
    }

    public static int bSearch(int[] nums, int target, int left, int right) {
        int mid = 0;
        while (left<=right) {
            mid = (left+right)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]>target) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
}
