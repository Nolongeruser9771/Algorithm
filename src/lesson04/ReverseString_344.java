package lesson04;

public class ReverseString_344 {
    public static void main(String[] args) {
        char[] s1 = {'h','e','l','l','o'};
        char[] s2 = {'h','e','l','l','o','m','e'};
        System.out.println(reverseString1(s1,0, s1.length-1));
        System.out.println(reverseString2(s2));
    }
    //Sử dụng đệ quy
    public static char[] reverseString1(char[] s, int i, int n) {
        if (i>n/2) return s;
        char tempt = s[i];
        s[i] = s[n-i];
        s[n-i] = tempt;
        reverseString1(s, i+1, n);
        return s;
    }

    //    Sử dụng vòng lặp
    public static char[] reverseString2(char[] s) {
        int middle = s.length/2-1;
        for (int i = 0; i <= middle; i++) {
            char tempt = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = tempt;
        }
        return s;
    }

}
