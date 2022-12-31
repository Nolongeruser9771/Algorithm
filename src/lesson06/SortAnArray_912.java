package lesson06;

import java.util.Arrays;

public class SortAnArray_912 {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        System.out.println(Arrays.toString(sortArray(nums)));
    }

    public static int[] sortArray(int[] nums) {
        int n = nums.length;
        return mergerSort(nums,0,n-1);
    }

    public static int[] mergerSort(int[] nums, int L, int R) {
        //Step1: Chạy đệ quy, chia nhỏ mảng cho đến khi mảng chỉ còn 1 phần tử

        //Xét trường hợp đặc biệt / ĐK dừng
        if (L == R) {
            //Mảng chỉ có 1 phần tử
            int[] singleElement = {nums[L]};
            return singleElement;
        }
        //Chia mảng
        int key = (L + R) / 2;
        int[] n1 = mergerSort(nums, L, key);
        int[] n2 = mergerSort(nums, key + 1, R);


        //Trộn mảng n1, n2
        //Tạo 1 mảng mới có số phần tử bẳng tổng phần tử n1, n2
        int n = n1.length + n2.length;
        int[] result = new int[n];

        //Nhét n1, n2 vào mảng result
        int i = 0, i1 = 0, i2 = 0; //i trỏ vào result, i1 trỏ vào n1, i2 trỏ vào n2
        while (i < n) //n1 hoặc n2 rỗng
            if (i1 < n1.length && i2 < n2.length) { //Cả n1 và n2 != rỗng
                if (n1[i1] <= n2[i2]) {
                    result[i] = n1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = n2[i2];
                    i++;
                    i2++;
                }
            } else if (i1 < n1.length) { //n1 != rỗng
                result[i] = n1[i1];
                i++;
                i1++;
            } else { //n2 != rỗng
                result[i] = n2[i2];
                i++;
                i2++;
            }
        return result;
    }
}
