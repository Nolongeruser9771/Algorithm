package lesson03;

import java.util.Arrays;

public class SortingTheSentence_1859 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));

    }

    public static String sortSentence(String s) {
    //B1: Tách từng word, đk s[i]=" " (32)   ---> Lưu vào mảng strs
        String[] strs = s.split(" ");
        int n = strs.length;
        System.out.println(Arrays.toString(strs));

    //B2: Tạo 1 mảng mới, fori -> kí tự cuối mỗi phần tử là index của mảng mới
        String[] words = new String[n];
        //duyệt mảng strs
        for (int i = 0; i < n; i++) {
            //lấy kí tự cuối (index)
            String currentWord = strs[i];
            int length =  strs[i].length();
            int currentIndex = Integer.parseInt(String.valueOf(currentWord.charAt(length-1)))-1;
            words[currentIndex] = currentWord.substring(0,length-1);
        }

        //Cộng string
        StringBuilder newStr = new StringBuilder();
        for (String str:words) {
            newStr.append(str +" ");
        }

        return newStr.toString().trim();
    }
}
