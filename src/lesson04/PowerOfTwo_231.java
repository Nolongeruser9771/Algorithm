package lesson04;

public class PowerOfTwo_231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo1(9));
        System.out.println(isPowerOfTwo2(16));
    }
    //Dùng đệ quy
    public static boolean isPowerOfTwo1(int n) {
        if (n==0) return false;
        return ((n==1) || (n%2==0 && isPowerOfTwo1(n/2)));
    }
    //Dùng vòng lặp
    public static boolean isPowerOfTwo2(int n) {
        if (n==0) return false;
        while (n%2==0) {
            n/=2;
        }
        return n==1;
    }
}
