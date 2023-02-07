package mid_term_test;

public class NumberOfGoodPair_1512 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        //B1. Tạo mảng phụ có giá trị index nums[i]  -> count freq
        int arr = 0;
        int[] count = new int[101]; //do nums[i]<100

        for (int i:nums) {
            count[i]++;
        }

        //B2. Tổng số cặp = tổ hợp chặp C(n,2) phần tử = n(n-1)/2
        for (int n:count) {
            arr += (n*(n-1))/2;
        }
        return arr;
    }
}
