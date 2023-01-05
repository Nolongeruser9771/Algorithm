package lesson01_02;

public class MatrixDiagonalSum_1572 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        //B1. Nếu leng = 1 -> return mat[0][0]
        int n = mat.length;
        if (n==1) return mat[0][0];

        //B2. Duyệt mảng từ 1 -> n tính tổng các vị trí [i][i] và [i][n-i-1]
        int sum = 0;
        for (int i = 0; i < n; i++) {
                sum += mat[i][i] + mat[i][n - i - 1];
            }

        //B3. Kiểm tra n là lẻ hay chẵn--> lẻ thì [n/2][n/2] xuất hiện 1 lần
        //Tức là trừ ra 1 giá trị [n/2][n/2]
        if (n%2!=0) {
            sum = sum - mat[n/2][n/2];
        }

        return sum;
    }
}
