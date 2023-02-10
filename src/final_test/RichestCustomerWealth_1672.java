package final_test;

public class RichestCustomerWealth_1672 {

    public int maximumWealth(int[][] accounts) {
        int bank = accounts[0].length; //số cột
        int maxWealth = 0;

        //B1: Tính tổng wealth của từng customer
        for (int[] account : accounts) { //Duyệt từng customer
            int wealth = 0;
            for (int j = 0; j < bank; j++) {
                wealth += account[j]; //Cộng tiền customer này gửi ở từng bank
            }

        //B2: So sánh -> gán cho max
            if (wealth > maxWealth) maxWealth = wealth;
        }

        return maxWealth;
    }
}