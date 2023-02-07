package mid_term_test;

import java.lang.reflect.Array;
import java.util.*;

public class FindTheDifferenceOfTwoArrays_2215 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int[] nums2 = {1,1,2,2};
        System.out.println(findDifference(nums1,nums2));
    }

    //Dùng mảng phụ
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //B1. Tạo hashSet n1, n2, add các phần tử của nums1, nums2 vào

        Set n1 = new HashSet<>();
        Set n2 = new HashSet<>();

        for (int n : nums1) n1.add(n);
        for (int n : nums2) n2.add(n);

        //Tạo hashSet n3 lưu phần tử có trong nums1 nhưng ko có trong nums2
        Set<Integer> n3 = new HashSet<>();

        for (int n : nums1) {
            if (!n2.contains(n)) {
                n3.add(n);
            }
        }

        ///Tạo hashSet n4 lưu phần tử có trong nums1 nhưng ko có trong nums2
        Set<Integer> n4 = new HashSet<>();

        for (int n : nums2) {
            if (!n1.contains(n)) {
                n4.add(n);
            }
        }

        List<Integer> list1 = new ArrayList<>(n3);
        List<Integer> list2 = new ArrayList<>(n4);

        return Arrays.asList(list1, list2);
    }
}
