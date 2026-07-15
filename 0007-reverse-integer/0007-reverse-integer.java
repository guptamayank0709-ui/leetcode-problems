class Solution {
    public int reverse(int x) {
        long reversed = 0;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x = x / 10;
        }
        if(reversed >Math.pow(2,31)-1||reversed<-Math.pow(2,31)){
            return 0;
        }

        return (int) reversed;
    }
}
