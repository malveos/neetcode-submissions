class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int r = 1;
        for (int i =1; i<=n;i++) {
            if (r *2==i)
                r = i;
            dp[i] = 1 + dp[i - r];
        }
        return dp;
    }
}
