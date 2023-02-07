package lesson01_02;

public class NumberOfGoodPair_1512 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
//        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs1(nums));
    }

    //Dùng 2 vòng lặp lồng nhau (Độ phức tạp hơi cao cơ mà dễ làm =)))
    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int pairsCount = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i]==nums[j]) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    //Sử dụng mảng phụ count, số lượng phần tử bằng giá trị phần tử lớn nhất trong nums -> gán nums[i] = Index[count]
    //Mỗi lần phần tử nums[i] xuất hiện count[index]++;
    public static int numIdenticalPairs1(int[] nums) {
            int ans = 0;
            int[] count = new int[101];

            //Tạo mảng count với index nums[i], giá trị là số lần lặp của nums[i]
            for(int n: nums)
                count[n]++;

            for(int n: count)
                //Số cặp = Tổ hợp lặp chặp 2 của n phần tử C(n,2) = n*(n-1)/2 -> Tính tổng
                ans += (n * (n - 1))/2;

            return ans;
        }
}
