package lesson03;

import java.util.Arrays;

public class MinimizeMaximumPairSumInArray_1877 {
    public static void main(String[] args) {
        int[] nums = {3,5,45,2,4,32};
//        System.out.println(minPairSum(nums));
//        System.out.println(minPairSum1(nums));
        System.out.println(minPairSum2(nums));
    }
    //Khả năng cao gấy Time Limit Exceeded
    public static int minPairSum(int[] nums) {
        //Sort dãy -> sum = A[i]+A[n-i-1] -> so sánh sum và maxSum

        //B1: sort dãy: chọn dùng selection sort
        //- Tìm giá trị nhỏ nhất [i,n]
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[minIndex] > nums[j]) {
                    minIndex = j;
                }
            }
            //- Đổi chỗ
            if (minIndex != i) {
                int tempt = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = tempt;
            }
        }

        //B2: So sánh. Ý tưởng amin <= ai <= amax, amin <= aj <= amax, sum(amin + amax, ai + aj) không nhỏ hơn sum(amin + ai, aj + amax)
        //--> so sánh tổng 2 số ở 2 cận
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < n / 2; i++) {
            sum = nums[i] + nums[n - i - 1];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }

    //Dùng Arrays.sort để sort tăng dần, dùng Math.max để so sánh max (Vẫn rất chậm)
    public static int minPairSum1(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int maxSum = 0;
        for (int i = 0; i < n/2; i++) {
            maxSum = Math.max(maxSum, (nums[i]+nums[n-i-1]));
        }
        return maxSum;
    }

    //2 con trỏ
    public static int minPairSum2(int[] nums) {
        int max = 0, n = nums.length;
        //Tìm số lớn nhất
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) max = nums[i];
        }

        //Tạo mảng mới với index bằng giá trị nums[i]
        int[] arr = new int[max + 1];

        for (int i = 0; i < n; i++) arr[nums[i]] += 1;

        int left = 0, right = max, temp = 0;
        while (left <= right) {
            if (arr[left] == 0) {
                left++;
                continue;
            }

            if (arr[right] == 0) {
                right--;
                continue;
            }
            //temp (sum) = left + right  ---> tìm sumMax;
            if (left + right > temp) temp = left + right;
            arr[left]--;
            arr[right]--;

            //Mỗi lần lấy giá trị từ left hoặc right -> phần tử tại vị trí đó đã được duyệt nên phải trừ bớt
            //--> trừ đến khi nào == 0 thì giá trị đó đã được duyệt hết -. nhảy qua phần tử kế tiếp
        }
        return temp;
    }
}

