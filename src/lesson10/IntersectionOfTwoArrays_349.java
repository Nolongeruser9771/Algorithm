package lesson10;

import java.util.*;

public class IntersectionOfTwoArrays_349 {
    public static void main(String[] args) {
        int[] n1 = {1,2,2,1};
        int[] n2 = {2,2};
        intersection(n1,n2);
    }

    public static int[] intersection(int[] n1, int[] n2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> interSet = new HashSet<>();

        //Ý tưởng: tạo set1 với key là giá trị không trùng lặp của n1;
        for (int i:n1) {
            if (!set1.contains(i)) set1.add(i);
        }

        //Tạo interSet chứa giá trị trùng lặp của set1 và n2
        for (int n: n2) {
            if (set1.contains(n)) {
                interSet.add(n);
            }
        }

        //convert set to array
        int[] intersection = new int[interSet.size()];
        int i = 0;
        for (int n:interSet) {
            intersection[i] = n;
            i++;
        }
        return intersection;
    }
}
