package lesson01_02;

import java.util.Arrays;

public class JewelsAndStones_771 {
    public static void main(String[] args) {
        String jewels = "aAc";
        String stones = "aAbbbbc";
        System.out.println(numJewelsInStones(jewels,stones));
        System.out.println(numJewelsInStones1(jewels,stones));
    }

    //Này thử cách convert mảng thôi chứ chạy chậm rì à
    public static int numJewelsInStones(String jewels, String stones) {
    //B1: Convert sang mảng jewelTypes = ["a","A"];
        char[] jewelTypes = jewels.toCharArray();

    //B2: Tạo mảng stonesChar = ["a","A","A","b","b","b","b"];
        //--> convert qua mảng stonesType với index = stonesChar[i]
        char[] stonesChar = stones.toCharArray();
        int[] stonesTypes = new int[123];

        for (int i:stonesChar) {
            stonesTypes[i]++;
        }
        System.out.println(Arrays.toString(stonesTypes));
    //B3: i --> stonesTypes ; j --> jewelTypes;
    //    stoneTypes[i]==0 (không có giá trị đó trong mảng stones -> skip
        int count = 0 ;
        for (int i = 0; i < 123; i++) {
            if (stonesTypes[i]==0) {
                continue;
            }

            for (int jewel:jewelTypes) {
                System.out.println(i);
                if (jewel==i) {
                    count+=stonesTypes[i];
                }
            }
        }
        return count;
    }

    //Sử dụng charAt và indexOf
    public static int numJewelsInStones1(String jewels, String stones) {
        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            char currentChar = stones.charAt(i);
            char[] jewelTypes = jewels.toCharArray();
            for (Character jewel:jewelTypes) {
                if (jewel==currentChar) {
                    count++;
                }
            }
        }
        return count;
    }
}

//Note: cách check giá trị stone có trong mảng không if (jewels.indexOf(stone) > -1)
