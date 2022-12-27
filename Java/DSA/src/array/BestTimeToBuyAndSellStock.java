package array;

public class BestTimeToBuyAndSellStock {

    // Question Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/


    public int maxProfit(int[] prices) {


        int profit = 0;

        int min = Integer.MAX_VALUE;

        for(int price : prices){

            min = Math.min(price,min);
            profit = Math.max(price-min,profit);

        }

        return profit;
    }


}
