package lesson05;

public class Sqrtx_69 {
    public static void main(String[] args) {
        int x =2147395599;
        System.out.println(mySqrt(x,1,x));
    }

    public static int mySqrt(int x, int left, int right) {
        if (x==1) return 1;
        while (left<=right) {
            int mid = right+(left-right)/2;
            if (mid==x/mid) {
                return mid;
            } else if (mid>x/mid) {
                right = mid-1;
            } else left = mid+1;
        }
        return right;
    }
}


