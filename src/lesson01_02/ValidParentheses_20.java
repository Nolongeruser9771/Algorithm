package lesson01_02;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "{[]}";
        System.out.println(isValid(s));
        System.out.println((int)'(' + "-" + (int)')' );
        System.out.println((int)'{' + "-" +(int)'}' );
        System.out.println((int)'[' + "-" +(int)']' );
    }

    public static boolean isValid(String s) {
        boolean isTrue = false;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i)=='(' & s.charAt(i+1)==')' || s.charAt(i)=='{' & s.charAt(i+1)=='}'||s.charAt(i)=='[' & s.charAt(i+1)==']') isTrue=true;
        }
        return isTrue;
    }
}
