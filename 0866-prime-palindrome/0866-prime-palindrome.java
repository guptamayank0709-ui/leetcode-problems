class Solution {
    public int primePalindrome(int n) {
        
        while (true) {
            if (ispalindrome(n) && prime(n)) {
                return n;
            }
            n++;
            // no 8-digit prime palindromes exist, so skip that range
            if (n >= 10_000_000 && n < 100_000_000) {
                n = 100_000_000;
            }
    }
    }
            
   boolean prime(int n){
    if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    boolean ispalindrome(int n){
        int o_n = n;
        int rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        if(rev == o_n){
            return true;
        }
        return false;
    }
}