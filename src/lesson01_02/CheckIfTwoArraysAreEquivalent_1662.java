package lesson01_02;

public class CheckIfTwoArraysAreEquivalent_1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual1(word1,word2));
        System.out.println(arrayStringsAreEqual2(word1,word2));
    }
    //Dùng String
    public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";

        for (String str:word1) {
            str1+=str;
        }

        for (String str:word2) {
            str2+=str;
        }

        return str1.equals(str2);
    }

    //Dùng StringBuilder
    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder("");
        StringBuilder str2 = new StringBuilder("");

        for (String str:word1) {
            str1.append(str);
        }

        for (String str:word2) {
            str2.append(str);
        }

        return (str1.toString().equals(str2.toString()));
    }
}
