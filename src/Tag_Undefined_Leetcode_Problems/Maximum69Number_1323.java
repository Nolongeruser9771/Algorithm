package Tag_Undefined_Leetcode_Problems;

import java.util.ArrayList;
import java.util.List;

public class Maximum69Number_1323 {
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }

    public static int maximum69Number (int num) {
        //Tạo mảng gồm các chữ số
        List<Integer> nums = new ArrayList<>();
        int tempt = num;
        int digit;
        int count = 0;

        while (tempt>0) {
            digit = tempt%10;
            tempt/=10;
            nums.add(digit);
            count++;
        }

        //xét từng chữ số từ phái qua trái, 6-> 9
        for (int i = count-1; i >=0 ; i--) {
            if (nums.get(i)==6) {
                nums.set(i,9);
                break;
            }
        }

        int result = 0;
        for (int i = count-1; i >=0 ; i--) {
            result  = result*10 + nums.get(i);
        }
        return result;
    }

    //Cách tham khảo
    public int maximum69Number2 (int num) {
        int ptr = num;
        int cnt = 1;
        int ans = 0;
        while(ptr > 0){
            int rem = ptr%10;
            ptr = ptr/10;
            if(rem == 6){
                ans = 3*cnt;
            }
            cnt = cnt*10;
        }
        return num+ans;
    }
}
