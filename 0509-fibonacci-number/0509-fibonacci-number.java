class Solution {
    public int fib(int n) {
     return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));   
    }
    // this is the mathematical way of doing this problem which is much more efficient 
}