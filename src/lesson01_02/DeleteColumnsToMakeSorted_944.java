package lesson01_02;

public class DeleteColumnsToMakeSorted_944 {
    public static void main(String[] args) {
        String[] strs = {"rrjk","furt","guzm"};
        System.out.println(minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {
        int count = 0;

        int m = strs[0].length();
        int n = strs.length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n-1; j++) {
                if (strs[j].charAt(i) > strs[j+1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
