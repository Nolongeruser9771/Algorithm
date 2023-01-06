package lesson01_02;

import java.util.Arrays;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] digits = {2,9};
//        System.out.println(Arrays.toString(plusOne(digits)));
        System.out.println(Arrays.toString(plusOne1(digits)));
    }

    //Chỉ dùng được trong dãy 10 phần tử trở lại
    public static int[] plusOne(int[] digits) {
        //Tìm số num, cộng các phần tử
        int n = digits.length;
        long num = 0;
        for (long i:digits) {
            num = num*10 + i;
        }

        //Tách từng phần tử của num+1
        int length = 0;
        if (n==1 && digits[0]==9) return new int[] {1,0};

        if (digits[n-1]==9 && digits[0]==9) length = n+1;
        else length = n;
        int[] nums = new int[length];

        long tempt = num+1;
        int i = 0;
        while (tempt>0) {
            int digit = (int) tempt % 10;
            nums[length-i-1] = digit;
            tempt/=10;
            i++;
        }
        return nums;
    }

    //
    public static int[] plusOne1(int[] digits) {
        //[n-1]!9 -> [n-1]++;
        int n = digits.length;
        if (digits[n-1]!=9) {
            digits[n-1]++;
            return digits;
        }

        if (n==1 && digits[0]==9) return new int[]{1,0};

        //tại vị trí i > 0 !9   ->  [i-1] = [i-1]+1; i = 0
        for (int i = n-1; i > 0 ; i--) {
            if (digits[i]==9) {
                if (digits[i-1]!=9) {
                    digits[i] = 0;
                    digits[i-1]++;
                    break;
                } else if (i-1>0) {
                    digits[i] = 0;
                } else {
                    int[] newDigits = new int[n+1];
                    newDigits[0] = 1;
                    return newDigits;
                }
            }
        }
        //duyệt từ n-1 -> 0; all = 9 -> new int[n+1] với [0]=1
        return digits;
    }
}
