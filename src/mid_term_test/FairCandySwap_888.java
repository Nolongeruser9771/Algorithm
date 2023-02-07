package mid_term_test;

import java.util.Arrays;

public class FairCandySwap_888 {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};

        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        //B1. Chọn khoá
        int Atotal = 0, Btotal = 0;
        for (int i : aliceSizes) Atotal += i;
        for (int i : bobSizes) Btotal += i;

        int middle = (Atotal + Btotal) / 2;

        //B2. Tồn tại giá trị khoá middle sao cho Atotal + i = Btotal + j = middle
        // ---> Lúc đó [i,j] là giá trị cần trao đổi để tổng không thay đổi
        for (int i : aliceSizes) {
            for (int j : bobSizes) {
                int Asum = Atotal - i, Bsum = Btotal - j;
                if (Asum - i == middle && Bsum - j == middle) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[2];
    }
}
