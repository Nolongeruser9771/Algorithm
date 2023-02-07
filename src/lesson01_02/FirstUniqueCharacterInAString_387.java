package lesson01_02;

public class FirstUniqueCharacterInAString_387 {
    public static void main(String[] args) {
        String  s = "loveleetcode";
        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar1(s));
    }
    //C1
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            char c = s.charAt(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j)==c && i!=j) {
                    count++;
                    break;
                }
            }
            if (count==0) return i;
        }
        return -1;
    }

    //C2 Kĩ thuật đếm bằng index, xem dãy string là như 1 dãy số
    //Tạo 1 mảng con hằng số, với index là số tương ứng với kí tự, giá trị là count của index đó

    public static int firstUniqChar1(String s) {
        char[] arr = s.toCharArray();
        int[] count = new int[123]; //lowercase alphabet from 1 -> 122

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            count[index]++;
        }

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            int index = (int) c;
            if (count[index]==1) {
                return i;
            }
        }
        return -1;
    }
}
