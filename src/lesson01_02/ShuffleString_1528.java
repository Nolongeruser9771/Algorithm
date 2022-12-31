package lesson01_02;

public class ShuffleString_1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
//        System.out.println(restoreString(s, indices));
        System.out.println(restoreString1(s,indices));
    }

    //C1: Chậm vô cùng chậm :)
    public static StringBuilder restoreString(String s, int[] indices) {
    //B1: Sắp xếp dãy indices tăng dần
        char[] str = s.toCharArray();
        int n = indices.length;
        for (int i = 0; i < n; i++) {

            boolean isSorted = true;
            for (int j = 0; j < n-i-1; j++) {
                if (indices[j] > indices[j+1]) {

                    //B2: Đổi index của s
                    isSorted = false;
                    swap(indices,j);
                    swap(str,j);

                }
            }
            if (isSorted) {
                break;
            }
        }

        StringBuilder sortedStr = new StringBuilder(n);
        for (char string:str) {
            sortedStr.append(string);
        }

        return sortedStr;
    }

    public static void swap(char[] str, int j) {
        char tempt = str[j];
        str[j] = str[j+1];
        str[j + 1] = tempt;
    }
    public static void swap(int[] indicates, int j) {
        int tempt = indicates[j];
        indicates[j] = indicates[j+1];
        indicates[j + 1] = tempt;
    }

    //C2: Đơn giản hơn: giá trị tại vị trí index<---(giá trị thứ i) là charAt(i)
    //Convert qua str bằng valueOf
    public static String restoreString1(String s, int[] indices) {
        int n = s.length();
        char[] sortedStr = new char[n];

        for (int i = 0; i < n; i++) {
            sortedStr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(sortedStr);
    }
}
