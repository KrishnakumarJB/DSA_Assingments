package learnings.week11;

public class StocksII {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        /**
         Two pointer approach
         Using while traverse right to end
         if left value is lesser than right move left to right
         if right+1 value is lesser than the current (right) get the profit
         and move to right+1
         */

        int left = 0, right=0, profit =0, totalProfit = 0;

        while(right < prices.length-1){

            if(prices[left] > prices[right]){
                left = right;
            }
            else if(prices[right] > prices[right+1] ){
                left = right+1;
            }
            totalProfit = prices[right] - prices[left];
            profit = totalProfit + profit;
            right++;
        }

        return profit;
    }
}












