class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    //    int steps = 0;
    //    while(num!=0){
    //    if(num%2 == 0){
    //     steps++;
    //     num = num/2;
    //    } else{
    //     steps++;
    //     num = num-1;
    //    }
    //    }
    //    return steps;
    //    will do by recursion too in just a short amount of time 
    
    
    private int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}