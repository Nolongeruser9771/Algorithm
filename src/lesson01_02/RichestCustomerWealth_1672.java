package lesson01_02;

public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        //m hàng  -> m customers
        //n cột   -> n ngân hàng
        //B1: Tính wealth từng khách hàng: wealth[i]: SUM([i][j]) j: 0-> n
        int customer = accounts.length;
        int bank = accounts[0].length;
        int maxWealth = 0;
        for (int[] account : accounts) {
            int wealth = 0;
            for (int j = 0; j < bank; j++) {
                wealth += account[j];
            }

            //B2: So sánh -> gán cho max
            if (wealth > maxWealth) maxWealth = wealth;
        }

        return maxWealth;
    }
}
