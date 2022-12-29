package lesson02;

import java.util.Arrays;

public class MergeSortedArray_88 {
    public static void main(String[] args) {
        int[] nums1 = {3,4,5,0,0,0};
        int m = 3,n = 3;
        int[] nums2 = {3,0,6};
        System.out.println(Arrays.toString(merge(nums1, 3, nums2, 3)));
        System.out.println(Arrays.toString(merge1(nums1, 3, nums2, 3)));
    }

    //Duyệt mảng nums2 -> insert lần lượt phần tử vào nums1
    //Step1: xác định k mà nums1(k)> i
    //Step2: Ko có -> chèn vào nums1[m];
    //       Có -> Dịch nums1[k] -> nums[m-1] sang phải 1 đơn vị, gán nums1[k] = i;
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i:nums2) {
            iInsert(i, nums1,m);
            m++;
        }
        return nums1;
    }

    public static void iInsert(int i, int[] nums1, int m) {
        boolean isKAvailable = false;
        for (int k = 0; k < m; k++) {
            if (nums1[k]>i) {
                isKAvailable = true;

                for (int j = m-1; j >= k; j--) {
                    nums1[j+1] = nums1[j];
                }
                nums1[k] = i;
                break;
            }
        }

        if (!isKAvailable) {
            nums1[m] = i;
        }
    }

    //Kĩ thuật con trỏ
    public static int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k =m+n-1;

        while (k>=0) {
            if (j<0) {
                nums1[k] = nums1[i];
                i--;
            } else if (i<0) {
                nums1[k] = nums2[j];
                j--;
            } else if (nums1[i]>nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        return nums1;
    }
}
