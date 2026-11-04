class Solution {
    public int maxProfit(int[] prices) {
        int currProfit = 0, maxProfit = 0;
        int len = prices.length;
        int minPrice = prices[0];
        for(int i = 1; i < len; i++){
            minPrice = Math.min(prices[i], minPrice);
            currProfit = prices[i] - minPrice;
            maxProfit = Math.max(currProfit, maxProfit);
        } 
        return maxProfit;
    }
}
