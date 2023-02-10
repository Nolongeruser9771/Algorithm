package final_test;

import java.util.Stack;

public class BackspaceStringCompare_844 {

    public static void main(String[] args) {
        String s = "isfcow#";
        String t = "isfco#w#";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String s, String t) {
        //B1: Xử lí 2 string bằng stack
        //Ý tưởng: nếu != '#' -> add vào stack
        // nếu =='#', pop ra
        String strS = add(s);
        String strT = add(t);

        System.out.println(strS + " " + strT);

        //B2: So sánh
        return strS.equals(strT);
    }

    public static String add(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (curChar != '#') stack.add(curChar);
            else if (!stack.isEmpty()) stack.pop();
        }
        return String.valueOf(stack);
    }
}
