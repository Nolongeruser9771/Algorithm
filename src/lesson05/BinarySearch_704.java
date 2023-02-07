package lesson05;

public class BinarySearch_704 {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(bSearch1(nums, target));
        System.out.println(bSearch2(nums,target));
    }

    public static int bSearch1(int[] nums, int target) {
        return search1(nums, target, 0, nums.length-1);
    }
    public static int bSearch2(int[] nums, int target) {
        return search2(nums, target, 0, nums.length-1);
    }

    //Sử dụng vòng lặp
    public static int search1(int[] nums, int target, int left, int right) {
        while (left<=right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    //Sử dụng đệ quy
    public static int search2(int[] nums, int target, int left, int right) {
        if (left>right) return -1;
        int mid = (left+right)/2;
        if (nums[mid]==target) {
            return mid;
        }else if (nums[mid]>target) {
            return search2(nums,target,left,mid-1);
        } else {
            return search2(nums, target, mid+1, right);
        }
    }
}
