class Solution {
    public int numberOfSteps(int num) {
       int steps = 0;
       while(num!=0){
       if(num%2 == 0){
        steps++;
        num = num/2;
       } else{
        steps++;
        num = num-1;
       }
       }
       return steps;
    //    will do by recursion too in just a short amount of time 
    }
}