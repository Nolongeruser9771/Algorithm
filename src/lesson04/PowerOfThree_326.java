package lesson04;

public class PowerOfThree_326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(72));
    }

    public static boolean isPowerOfThree(int n) {
        if (n==0) return false;
        while(n%3==0) {
            n/=3;
        }
        return n==1;
    }
}
