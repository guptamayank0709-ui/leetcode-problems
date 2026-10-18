class Solution {
    public boolean judgeSquareSum(int c) {
       
        long start = 0;
        long end = (long)Math.sqrt(c);
        while(start<=end){
        long cs = start*start + end*end;
        if(cs==c){
            return true;
        }
        if(cs<c){
            start++;
        }else{
            end--;
        }
    }
    
            return false;
    }
}