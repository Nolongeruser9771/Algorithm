package lesson03;

import java.util.Arrays;

public class Sort_Implement {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(bubbleSort(nums)));
//        System.out.println(Arrays.toString(insertionSort(nums)));
//        System.out.println(Arrays.toString(selectionSort(nums)));

    }

    //Dồn phần tử lớn nhất vào cuối mảng
    public static int[] bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {

            boolean isSorted = true;
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j]>nums[j+1]) {
                    isSorted = false;
                    int tempt = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tempt;
                }
            }
            //Thêm điểm dừng khi mảng đã được sắp xếp
            if (isSorted) {
                break;
            }
        }
        return nums;
    }

    //Chạy từ đầu đến cuối mảng -> fori
    //Coi như dãy 0-> i-1 đã sắp xếp, chèn phần tử a[i] vào vị trí thích hợp
    //Chèn ->? dời các phần từ a[i+1] sang phải 1 đơn vị
    public static int[] insertionSort(int[] nums) {
        int n = nums.length;

        for (int i = 1; i <n; i++) {
            //Chèn phần từ a[i]
            int ai = nums[i];
            int j = i-1;
            //so sánh phần tử từ i-1 tới 0 với ai
            while (j>=0 && nums[j]>ai) {
                nums[j+1] = nums[j];
                j--;
            }
            //chèn vào vị trí thứ j (cũ), trước khi bị lùi 1 đơn vị
            nums[j+1] = ai;
        }
        return nums;
    }

    //Duyệt mảng -> fori: tìm phần tử nhỏ nhất min [i+1, n-1] (phía bên phải của i)
    //Nếu min nhỏ hơn ai thì đổi chỗ cho ai
    public static int[] selectionSort(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            //Tìm giá trị nhỏ nhất từ [i+1, n-1]
            for (int j = i+1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            //Nếu có giá trị nhỏ hơn ai trong phần phía bên phải của mảng, tiến hành đổi chỗ
            if (minIndex!=i) {
                int tempt = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = tempt;
            }
        }
        return nums;
    }
}
