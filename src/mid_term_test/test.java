package mid_term_test;

public class test {
    public static void main(String[] args) {
        int tempt = 3;
        int digit;
        int sum = 0;

        while (tempt > 0) {
            digit = tempt % 10;
            tempt /= 10;
            sum += digit * digit;
            // 1 2 3 4 5 6 7 8 9
            // 1 4 9...
            System.out.println(sum);
            if (sum!=1) tempt=sum*sum;
        }
    }

}
