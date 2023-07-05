package learnings.week11;

public class Stocks {

    /**
     * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
     * Psudeo code
     *      approach - two pointer
     *      loop the entire array
     *      if left > right move the right to left
     *      move the left to lesser than right left < right assign the value to least
     *      then move the right pointer to max of element
     *      finaly return the higher value
     *
     * @param args
     */

    public static void main(String[] args) {

        int[] prices = {2,1,2,1,0,1,2};
        System.out.println(maxProfit(prices));
    }


    public static int maxProfit(int[] prices) {
        int left = 0, right = 0, profit = 0, max=0;


        while(right < prices.length){
            if(prices[left] > prices[right]){
                left = right;
            }
            max = prices[right] - prices[left];
            profit = Math.max(profit, max);
            right++;
        }

        return profit;
    }

}














