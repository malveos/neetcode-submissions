class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int st = prices[0];
        for (int i=1; i<prices.length; i++) {
            int profit = prices[i] - st;
            st = Math.min(st, prices[i]);
            max = Math.max(profit, max);
        }
        return max;
    }
}
