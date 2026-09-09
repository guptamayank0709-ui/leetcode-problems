class Solution {
    public long countCommas(long n) {
       long ans = 0;
        long threshold = 1000L;

        for (int i = 0; i < 5; i++) {
            if (n >= threshold) {
                ans += n - threshold + 1;
            }
            threshold *= 1000L;
        }

        return ans;
    }

}