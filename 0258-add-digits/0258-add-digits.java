class Solution {
    public int addDigits(int n) {
       while (n >= 10) {
            n = digitsum(n);
        }
        return n;
    }
    int digitsum(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n = n/10;
        }
        return sum;
    }
}