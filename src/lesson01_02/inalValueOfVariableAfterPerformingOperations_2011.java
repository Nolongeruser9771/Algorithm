package lesson01_02;

public class inalValueOfVariableAfterPerformingOperations_2011 {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String str:operations) {
            if (str.equals("X++") || str.equals("++X")) X++;
            else X--;
        }
        return X;
    }
}
