class Solution {
    public int uniquePaths(int m, int n) {
        long result = 1;
        int totalMoves = m + n - 2;
        int r = Math.min(m - 1, n - 1); // pick smaller for fewer iterations

        // Compute C(totalMoves, r) iteratively to avoid overflow/factorials
        for (int i = 1; i <= r; i++) {
            result = result * (totalMoves - r + i) / i;
        }

        return (int) result;
    }
}