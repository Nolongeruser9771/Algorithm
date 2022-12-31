package lesson01_02;

public class SplitAStringInBalancedStrings_1221 {
    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    }

    public static int balancedStringSplit(String s) {
    //Duyệt mảng
        //Cho 1 biến count: s[i] = "L", count++; s[i] = "R", count--;
        int count = 0;
        int balancedStrNum = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar=='L') {
                count++;
            } else count--;
            //count = 0 -> balancedStrNum++;
            if (count==0) {
                balancedStrNum++;
            }
        }
        return balancedStrNum;
    }
}
