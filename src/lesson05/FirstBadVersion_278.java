package lesson05;

public class FirstBadVersion_278 {
    public static void main(String[] args) {
        int n = 2126753390;
        System.out.println(firstBadVersion(n));
    }
    //for testing only, not to solve the problem
    public static boolean isBadVersion(int version) {
        if (version==1) return true;
        else return false;
    }

    public static int firstBadVersion(int n) {
        return versionCheck(n,1,n);
    }
    public static int versionCheck(int n, int left, int right) {
        while(left<right) {
            int mid = left+(right-left)/2;
            System.out.println(mid);
            if (isBadVersion(mid)) {
                right=mid;
            } else left=mid+1;
        }
        return left;
    }
}