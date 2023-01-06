package lesson01_02;

import java.util.Arrays;
import java.util.Objects;

public class WordPattern_290 {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern,s));
    }
    //Này phải dùng HashMap thôi =((

    public static boolean wordPattern(String pattern, String s) {
        //B1. Cắt chuỗi s, cắt chuỗi pattern
        char[] patterns = pattern.toCharArray();
        String[] strs = s.split(" ");

        //B2. Convert chuỗi pattern và string sang chuỗi ref: index -> pattern, value --> s
        String [] ref = new String [123];
        int i = 0 ;
        int n = strs.length;
        for (char p:patterns) {
            while (i<n)
            {
                for (String r:ref) {
                    if (Objects.equals(r, strs[i])) {
                        i++;
                        break;
                    } else if (ref[p]==null) {
                        ref[p] = strs[i];
                        i++;
                        break;
                    }
                }
                i++;
            }
        }


        //B3. ĐK: ref[pattern[i]] ! value   -> false
        for (int j = 0; j < patterns.length; j++) {
            if (!strs[j].equals(ref[patterns[j]])) return false;
        }
        return true;
    }

//    public static boolean isDuplicated(int[] ref, int[] strs, int i) {
//
//    }
}
