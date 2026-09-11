class Solution {
    public int trailingZeroes(int n) {
        int i = 1;
        int sum = 0;
        while((int)(n/Math.pow(5,i))!=0){
            sum+=(int)(n/Math.pow(5,i));
            i++;
        }
        return sum;
    
    }
}