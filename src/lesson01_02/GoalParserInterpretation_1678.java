package lesson01_02;

public class GoalParserInterpretation_1678 {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        //B1. Duyệt phần tử của command: G->i++,
        // (-> (--> i+=2
        //     a--> i+=4
        int i = 0;
        int n = command.length();
        StringBuilder interpret = new StringBuilder();
        while (i<n) {
            char currentChar = command.charAt(i);
            if (currentChar=='G') {
                interpret.append('G');
                i++;}
            else if (currentChar=='(' && command.charAt(i+1)==')') {
                interpret.append('o');
                i+=2;
            } else {
                interpret.append('a').append('l');
                i+=4;
            }
        }
        //B2. Tạo stringBuilder lưu các phần tử convert

        return interpret.toString();
    }
}
