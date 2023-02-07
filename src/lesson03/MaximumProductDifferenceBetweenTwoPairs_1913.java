package lesson03;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs_1913 {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
//        System.out.println(maxProductDifference(nums));
        System.out.println(maxProductDifference2(nums));
    }
    //Duyệt mảng --> tính cal -> so sánh
    public static int maxProductDifference(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int tempt = 0;
        int maxCal = 0;
        for (int i = 0; i < n/2+1; i++) {
            tempt = nums[n-i-1]*nums[n-i-2] - nums[i]*nums[i+1];
            maxCal = Math.max(maxCal,tempt);
        }
        return maxCal;
    }

    //Tham khảo: giá trị lớn nhất thu được là giá trị hiệu max - min (ở 2 cận)
    public static int maxProductDifference2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int sumMax =(nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
        return sumMax;
    }

    //Tìm largest và second largest
    public int maxProductDifference3(int[] nums) {
        // sorting,Priority Queue
        // maimize a*b ,minimize c*d

        // 0<=curr<nums.length{
        //  if curr>largest{
        //   secondLargest=largest
        //   largest=curr}
        //   if curr>secondLargest
        //      secondLargset=curr;}

        //    --------------smallest-------------
        //    0<=curr<nums.length{
        //    if curr<smallest{
        //         secondSmallest=smallest
        //         smallest=curr}
        //     if  smallest<curr<secondSmallest
        //        secondSmallest=curr
        //      }
        // return (largest*secondLargest)-(smallest*secondSmallest);
        // SPACE O(1)
        // TIME O(N)
        int largest=0,secondLargest=0,smallest=Integer.MAX_VALUE,secondSmallest=Integer.MAX_VALUE-1;
        int a=0,b=0,c=Integer.MAX_VALUE,d=Integer.MAX_VALUE-1;
        for(int curr:nums)
        {
            //   if(curr>largest)
            //   {
            //       secondLargest=largest;
            //       largest=curr;
            //   }
            //   else if(curr>secondLargest)
            //         secondLargest=curr;
            if(curr>a || curr>b)
            {
                //  secondLargest=Math.max(secondLargest,largest);
                a=Math.max(a,b);
                b=curr;
                //  secondLargest=Math.min(secondLargest,largest);
            }
            //   if(curr<smallest)
            //   {
            //       secondSmallest=smallest;
            //       smallest=curr;
            //   }
            //   else if(curr<secondSmallest)
            //     secondSmallest=curr;
            if(curr<c || curr<d)
            {
                c=Math.min(c,d);
                d=curr;
            }
        }
        return ((a*b)-(c*d));
    }
}
