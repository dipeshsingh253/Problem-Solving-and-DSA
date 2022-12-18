package array;

public class RichestCustomerWealth {

    //Question Link : https://leetcode.com/problems/richest-customer-wealth/

    static int provideSum(int[] arr) {
        int sum = 0;

        for (int i : arr)
            sum += i;

        return sum;
    }

    public int maximumWealth(int[][] accounts) {

        int m = accounts.length;
        int n = accounts[0].length;
        int max = -1;
        for (int i = 0; i < m; i++) {
            int money = provideSum(accounts[i]);
            if (money >= max) {
                max = money;
            }
        }

        return max;

    }

}
