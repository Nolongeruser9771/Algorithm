package lesson12;

public class NumbersOfIsland_200 {
    //Ý tưởng: Duyệt mảng, khi gặp phần tử == 1, duyệt 4 phía xung quanh (chạy DFS) --> count++ (1 cụm số 1 tạo thành 1 đảo)
    static char[][] grid = {{'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'},
            {'0','0','1','0','0'}};

    public static void main(String[] args) {
        System.out.println(numIslands(grid));
    }

    static boolean[][] approved = new boolean[301][301]; //constain: 1 <= m, n <= 300
    static int r;
    static int c;

    public static boolean isValid(int i, int j) {
        return i >= 0 && j >= 0 && i < r && j < c; //chỉ số hàng cột ko được vượt ra khỏi mảng
    }

    public static void DFS(char[][] grid, int i, int j) {
        //Xét điều kiện dừng
        if (!isValid(i,j)) return; //nếu i,j vượt ra khỏi mảng - dừng
        if (grid[i][j]=='0' || approved[i][j]) return; // nếu vị trí đang xét ==0|| đã được duyệt rồi - dừng

        approved[i][j] = true; // còn lại, đánh đấu đã duyệt
        //Đệ quy (gọi lại hàm DFS, xét 4 phía)
        DFS(grid, i, j+1); //sang phải
        DFS(grid, i, j-1); //sang trái
        DFS(grid, i+1, j); //lên trên
        DFS(grid, i-1, j); //xuống dưới
    }

    public static int numIslands(char[][] grid) {
        int count = 0;
        r = grid.length;
        c = grid[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j]== '1' && !approved[i][j]) { //vị trí đang xét bằng 1, và chưa được duyệt
                    DFS(grid,i,j); //duyệt xung quanh node đó
                    count++;
                }
            }
        }
        return count;
    }
}
