class Solution {
    public int integerReplacement(int n) {
        int steps = 0;

        long n1 = n;

        while(n1!=1){
            if(n1%2==0){
                n1 = n1/2;
            }else if(n1==3||n1%4==1){
                n1 = n1-1;
            }else{
                n1 = n1+1;
            }
        steps++;
        }
        return steps;
    }
}