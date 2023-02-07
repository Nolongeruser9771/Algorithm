package lesson03;

import java.util.Arrays;

public class SortThePeople_2418 {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
//        System.out.println(Arrays.toString(sortPeople(names, heights)));
        System.out.println(Arrays.toString(sortPeople2(names, heights)));

    }

    //Dùng mảng phụ
    public static String[] sortPeople(String[] names, int[] heights) {
        //B1: Tạo mảng people có index bằng giá trị chiều cao, giá trị bằng giá trị names
        String[] people = new String[100001];
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            people[heights[i]] = names[i];
        }

        //B2: Duyệt mảng people, lưu giá trị khác null
        String[] sortedNames = new String[n];
        int i = n - 1;
        while (i >= 0) {
            for (String p : people) {
                if (p != null) {
                    sortedNames[i] = p;
                    i--;
                }
            }
        }
        return sortedNames;
    }

    //C2: Dùng quicksort
    public static String[] sortPeople2(String[] names, int[] heights) {
        quickSort(heights, names, 0, heights.length - 1);
        return names;
    }

    public static void quickSort(int[] heights, String[] names, int left, int right){
        if(left< right){
            int pivot= partition(heights, names, left, right);
            quickSort(heights, names, left, pivot-1);
            quickSort(heights, names, pivot+1, right);
        }
    }

    public static int partition(int[] heights, String[] names, int left, int right){
        int i = left-1;
        int pivot = right; //chọn khoá là phần tử cuối cùng
        for(int j = left;j<=right;j++){
            if(heights[j] >= heights[pivot]){
                i++;
                int temp = heights[i];
                heights[i] = heights[j];
                heights[j] = temp;

                String tempName = names[i];
                names[i] = names[j];
                names[j] = tempName;
            }
        }
        return i;
    }
}
