class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int hold = -prices[0];
        int sold = 0;
        int rest = 0;

        for (int i = 1; i < n; i++) {
            int prevHold = hold;
            int prevSold = sold;

            hold = Math.max(prevHold, rest - prices[i]);
            sold = prevHold + prices[i];
            rest = Math.max(rest, prevSold);
        }

        return Math.max(sold, rest);
    }
}