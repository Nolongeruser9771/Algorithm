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
        //B1. Chọn khoá
        int key = nums[(start+end)/2];

        //B2. Phân bố lại mảng theo khoá key
        int k = partition(nums,start,end, key);


        //B3. Chia đôi mảng, lặp lại
        quickSort(nums,start, k-1);
        quickSort(nums, k, end);
        return nums;
    }

    //Return giá trị pivot value
    private static int partition(int[] nums, int start, int end, int key) {
        int i = start;
        int j = end;
        while (i<=j) {
            //Với start -> tìm phần từ lớn hơn để đổi chỗ
            //Với end -> Tìm phần tử nhỏ hơn để đổi chỗ
            while (nums[i]<key) i++;
            while (nums[j]>key) j--;

            //Đổi chỗ 2 phần tử đứng không đúng vị trí
            if (i<=j) {
                int tempt = nums[i];
                nums[i] = nums[j];
                nums[j] = tempt;

                //Nhảy bước
                i++;
                j--;
            }
        }
        return i;
    }
}
