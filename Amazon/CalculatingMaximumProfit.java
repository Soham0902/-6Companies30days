package Amazon;

public class CalculatingMaximumProfit {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n <= 1)
            return 0;

        if (k >=  n/2) {
            int maxPro = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i-1])
                    maxPro += prices[i] - prices[i-1];
            }
            return maxPro;
        }
        
        int[][] dp = new int[k+1][n];
        for (int i = 1; i <= k; i++) {
            int localMaximum = dp[i-1][0] - prices[0];
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i][j-1],  prices[j] + localMaximum);
                localMaximum = Math.max(localMaximum, dp[i-1][j] - prices[j]);
            }
        }
        return dp[k][n-1];
    }
}
