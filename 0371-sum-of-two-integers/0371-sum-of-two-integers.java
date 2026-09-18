class Solution {
    public int getSum(int a, int b) {
     while (b != 0) {
            // Calculate the carry bits and shift them left by 1
            int carry = (a & b) << 1;
            // Perform addition without the carry
            a = a ^ b;
            // Assign the carry to b for the next iteration
            b = carry;
        }
        return a;
    }
}