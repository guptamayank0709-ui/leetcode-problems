class Solution {
   public boolean isPowerOfFour(int n) {
    if (n <= 0 || (n & (n - 1)) != 0) {
        return false;
    }

    int pos = 0;
    while ((n & 1) == 0) {
        pos++;
        n >>= 1;
    }

    return pos % 2 == 0;
}
}