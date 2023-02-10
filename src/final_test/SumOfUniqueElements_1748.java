package final_test;

public class SumOfUniqueElements_1748 {

    //Ý tưởng: tạo mảng phụ freq với index là giá trị phần tử của nums[];
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[101]; //constrain: 1 <= nums[i] <= 100

        //Tạo mảng phụ freq
        for (int i:nums) {
            freq[i]++;
        }

        //Duyệt và cộng những phần tử xuất hiện 1 lần
        int sum = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]==1) sum+=i;
        }
        return sum;
    }
}
