package lesson01_02;

import java.util.Arrays;

public class ReverseWordsInAStringIII_557 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        //B1: Tách chữ lưu vào mảng

        String[] strs = s.split(" ");
        System.out.println(Arrays.toString(strs));

        //B2: Duyệt mảng --> mỗi phần tử: duyệt kí tự và reverse
        int n = strs.length;
        StringBuilder result = new StringBuilder();
        for (String str:strs) {
            char[] currentWords = str.toCharArray();
            int length = currentWords.length;
            for (int i = 0; i < length/2; i++) {
                char tempt = currentWords[i];
                currentWords[i] = currentWords[length-i-1];
                currentWords[length-i-1] = tempt;
            }

            //B3: Ghép các phần tử trong mảng lại
            StringBuilder sortedStr = new StringBuilder();

            for (int i = 0; i < length; i++) {
                sortedStr.append(currentWords[i]);
            }

            result.append(sortedStr).append(" ");

        }
        return result.toString().trim();
    }

    //Convert qua Byte
    public String reverseWords2(String s) {
        byte[] bytes = s.getBytes();
        int left = 0, right=0;
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i]==32||i == bytes.length-1){
                right = i==bytes.length-1?i:i-1;

                while (left<right){
                    byte temp = bytes[left];
                    bytes[left] = bytes[right];
                    bytes[right] = temp;
                    left++;
                    right--;
                }
                left = i+1;
            }
        }
        return new String(bytes);
    }
}
