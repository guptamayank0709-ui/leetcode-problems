class Solution {

       public int reverseBits(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result <<= 1;              // make room for the next bit
        result |= (n & 1);         // append n's lowest bit to result
        n >>= 1;                   // move to n's next bit
    }
    return result;
}
}