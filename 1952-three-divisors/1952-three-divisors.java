class Solution {
    public boolean isThree(int n) {
       if(n==1||n==2){
        return false;
       }
       int count = 2;
       int i =2;
       while(i<n){
        if(n%i==0){
            count++;
        }
        i++;
       }
      if(count==3){
        return true;
      }
      return false;
    }
}