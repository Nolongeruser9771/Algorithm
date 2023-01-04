package lesson03;

public class MinimumSumOfFourDigitNumberAfterSplittingDigits_2160 {
    public static void main(String[] args) {
        int nums = 2932;
        System.out.println(minimumSum(nums));
    }

    public static int minimumSum(int num) {
        //B1: Tách chữ số -> lưu vào mảng digits
        int tempt = num;
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = tempt%10;
            tempt/=10;
        }

        //B2: Sắp xếp tăng dần, chọn sắp xếp nổi bọt
        for (int i = 0; i < 4; i++) {

            boolean isSorted = true;
            for (int j = 0; j < 3-i; j++) {
                if (digits[j]>digits[j+1]) {
                    isSorted = false;
                    int temp = digits[j];
                    digits[j] = digits[j+1];
                    digits[j+1] = temp;
                }
            }
            if (isSorted) break;
        }

        //B3: Return giá trị int a = digits[0]digit[n-1] + digits[1]digits[n-2]

        return digits[0]*10+digits[3]+digits[1]*10+digits[2];
    }
}
