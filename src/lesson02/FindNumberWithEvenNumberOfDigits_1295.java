package lesson02;

public class FindNumberWithEvenNumberOfDigits_1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

    //Duyệt mảng
    //Tính số lượng chữ số từng phần từ
    //Kiểm tra tổng chữ số từng phần tử

    public static int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for (int i : nums) {
            int digitNum = digitNumCal(i);
            if (digitNum % 2 == 0) {
                evenDigitCount++;
            }
        }
        return evenDigitCount;
    }

    private static int digitNumCal(int i) {
        int digitCount = 0;
        while (i > 0) {
            i /= 10;
            digitCount++;
        }
        return digitCount;
    }
}
