package lesson01_02;

import java.util.Arrays;

public class MaximumNumberOfWordsFoundInSentences_2114 {
    public static void main(String[] args) {
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentences));
    }

    //C1: Tách từng phần tử, đếm từ, so sánh
    public static int mostWordsFound(String[] sentences) {
        //B1: Tính số từ của mỗi phần tử sentences[i];   i: trỏ vào mảng sentences
        //    charAt[j] = " "  -> count++ (count từ 1) ; j: trỏ vào mảng sentences[i]
        int maxCount = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 1;
            String currentWord = sentences[i];
            for (int j = 0; j < currentWord.length(); j++) {
                char currentChar = currentWord.charAt(j);
                if (currentChar==' ') {
                    count++;
                }
            }
            //B2: So sánh max
            if (count>maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    //C2: Dùng sentences.split(" ");  -> Tạo ra mảng với phần tử là các từ được tách bởi regex " "
}
