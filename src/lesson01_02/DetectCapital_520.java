package lesson01_02;

public class DetectCapital_520 {
    public static void main(String[] args) {
        String word = "Amazon";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        //ASCII: UpperCase: 65 -> 90, lowercase: 97 -> 122
        int countU = 0;
        int countL = 0;

        char[] strs = word.toCharArray();
        for (char s: strs) {
            if (s>=65 && s <=90) countU++;
            else countL++;
        }

        //Kiểm tra nếu countU = n||countL = n   -> true
        //Nếu countU = 1 --> check 90> strs[0] >65
        int n = word.length();
        if (countU==n||countL==n) return true;
        else return (countU == 1) && (strs[0] >= 65) && (strs[0] <= 90);
    }
}
