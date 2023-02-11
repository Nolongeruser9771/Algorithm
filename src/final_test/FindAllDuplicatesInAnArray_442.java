package final_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInAnArray_442 {
    public static void main(String[] args) {
        //Ý tưởng: sử dụng hashMap (key = nums[i], value = freq(nums[i])
        int[] nums = {1};
        System.out.println(findDuplicates(nums));
    }

    //Quá chậm...
    public static List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i:nums) {
            if (!map.containsKey(i)) { //1 key chỉ xuất hiện 1 or 2 lần
                map.put(i,1);
            }else {
                map.put(i,2);
            }
        }

        List<Integer> duplicateList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> item: map.entrySet()) {
            //Duyệt và add key có value ==2 (xuất hiện 2 lần)
            if (item.getValue().equals(2)) duplicateList.add(item.getKey());
        }
        return duplicateList;
    }

    //Ý tưởng 2: Dùng mảng convert to freq[] với index = nums[i]
    public static List<Integer> findDuplicates2(int[] nums) {
        if (nums.length<=1) return new ArrayList<>();

        int[] freq = new int[100000]; //constrain: 1 <= n <= 105
        for (int i:nums) {
            freq[i]++;
        }

        List<Integer> duplicateList  = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]==2) duplicateList.add(i);
        }
        return duplicateList;
    }
}
