class Solution {
    public int minCostClimbingStairs(int[] cost) {
         for (int i = cost.length-3; i>=0; i--)
            cost[i] +=Math.min(cost[i+1], cost[i+2]);
         return Math.min(cost[0], cost[1]);
    }

    private int dfs(int[] cost, int i) {
        if (i >= cost.length) {
            return 0;
        }
        return cost[i] + Math.min(dfs(cost, i + 1),
                                  dfs(cost, i + 2));
    }
}
