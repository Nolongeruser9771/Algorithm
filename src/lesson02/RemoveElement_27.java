package lesson02;

import java.util.Arrays;

public class RemoveElement_27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
        System.out.println(removeElement1(nums, val));
    }
    //Step1: Duyệt mảng
    //Step2: Xoá phần tử
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n;) {
            if (nums[i] == val) {
                for (int j = i; j < n-1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    //Kĩ thuật con trỏ
    public static int removeElement1(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i]!=val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
