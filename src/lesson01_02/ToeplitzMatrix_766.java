package lesson01_02;

public class ToeplitzMatrix_766 {
    public static void main(String[] args) {
        int[][] matrix = {{11, 74, 0, 93}, {40, 11, 74, 7}};
        System.out.println(isToeplitzMatrix(matrix));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length; //hàng
        int n = matrix[0].length; // cột
        //gọi 1 phần tử đầu tiên thuộc đường chéo matrix[r][c],
        //các giá trị còn lại thuộc đường chéo [r+1][c+1], với r, c tăng dần
        for (int r = 0; r < m-1; r++) {
            for (int c = 0; c < n-1; c++) {
                if (matrix[r][c] != matrix[r+1][c+1]) return false;
            }
        }
        //Quy tắc nhân: vòng lặp ngoài O(m), trong O(n), độ phức tạp O(mxn)
        return true;
    }
}
