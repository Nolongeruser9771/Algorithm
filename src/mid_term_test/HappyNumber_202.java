package mid_term_test;

public class HappyNumber_202 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        //B1. Tách chữ số --> Tính tổng bình phương mỗi chữ số
        //B2. Lặp lại với tổng sum tìm được
        int tempt = n;
        int digit;
        int sum = 0;

        if (n==1) return true;

        while (tempt > 0) {
            digit = tempt % 10;
            tempt /= 10;
            sum += digit * digit;
        }
            if (sum == 1) return true;
            else if (sum == 4) return false;
        return isHappy(sum);
    }
}
// 1 2 3
// 1 4 9
