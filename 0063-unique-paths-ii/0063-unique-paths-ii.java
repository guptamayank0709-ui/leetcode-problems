class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] dp = new int[n];
        dp[0] = 1; // start cell (obstacle case handled below)

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dp[j] = 0;            // obstacle kills paths through this column
                } else if (j > 0) {
                    dp[j] += dp[j - 1];   // add paths from the left
                }
                // j == 0 and cell is free: dp[0] carries over from row above
            }
        }

        return dp[n - 1];
    }
}