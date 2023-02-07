package Tag_Undefined_Leetcode_Problems;

public class ClimbingStairs_70 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(climbStairs(n));
        System.out.println(climbStairs1(n));
    }

    public static int climbStairs(int n) {
        //n = 0 -> 0 cách
        //n = 1 -> 1 cách
        //n = 2 -> 2 cách
        //n = 3 -> 3 cách
        //n = 4 -> 5 cách
        //n = 5 (từ n4->n5: 1 cách - bước 1 bậc| từ n3 -> n5, bước 1+1 bậc (qua n4-> qua n5 -> trùng với n4->5) hoặc bước 2 bậc| n4+n5 = 3+5 =8;
        //Tính từ bậc thứ 3, F(n) = F(n-1) + F(n-2) -> Dãy fibonacci

        //C1. Dùng mảng phụ, vòng lặp
        int[] Fn = new int[n+1];

        if (n==2||n==1||n==0) return n;
        else {
            Fn[0] = 0;
            Fn[1] = 1;
            Fn[2] = 2;

            for (int i = 3; i <= n; i++) {
                Fn[i] = Fn[i - 1] + Fn[i - 2]; //Số sau bằng tổng 2 số trước
            }
        }
        //Độ phức tạp time = O(n) - 1 vòng lặp, space O(1) - 1 bộ nhớ
        return Fn[n];
    }

    public static int climbStairs1(int n) {
        //Dùng đệ quy
        return fib(n);
    }

    public static int fib(int n) {
        //C2. Dùng đệ quy
        if (n==0||n==1||n==2) return n;
        int Fn = fib(n-1)+ fib(n-2);
        return Fn;
        //Độ phức tạp time: O(2^n) - đệ quy, space = O(n) - n lần nhớ
    }
}
