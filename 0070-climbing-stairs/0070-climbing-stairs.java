class Solution {
    public int climbStairs(int n) {
       if(n<3){
        return n;
       }
       
       int n1 = 1;
       int n2 = 2;
       int count = 3;
      
      
       while(count<=n){
        int temp = n1+n2;
        n1 = n2;
        n2 = temp;
        count++;
       }
       return n2;
        }
    }
