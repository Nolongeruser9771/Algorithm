package lesson09;

import java.util.Stack;

public class ValidParentheses_20 {
    public static void main(String[] args) {
        String s = "([]){}";
        System.out.println(isValid(s));
    }

    //Sử dụng stack:
    public static boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();
        //B1: Nhét lần lượt từng kí tự mở ngoặc vào stack
        //    Kiểm tra lần lượt các cặp ngoặc trùng -> pop ra
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                myStack.push(c);
            } else {
                if (myStack.isEmpty()) return false;//nếu stack empty thì dừng lấy top
                char top = myStack.peek(); // lấy kí tự top của stack
                if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    myStack.pop();
                } else {
                    return false;
                }
            }
        }

        //B2: Kiểm tra stack empty -> true
        return myStack.isEmpty();
    }

    //s = "([]){}"
    //stack='('
    //stack='['
    //i = ']' -> '[' -> pop'['
    //i = ')' -> '(' -> pop '('
    //stack ='{'
    //i = '}' -> '{' -> pop '{'
    //empty--> true
}
