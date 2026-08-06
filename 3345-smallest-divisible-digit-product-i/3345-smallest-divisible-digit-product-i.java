class Solution {
    public int smallestNumber(int n, int t) {
     int ans = 0;
   
    while(findproduct(n)%t!=0){
        n++;
    }
    ans = n;
    return ans;   
    }
    int findproduct(int n){
   int product = 1;
    while(n!=0){
        product = product*(n%10);
        n = n/10;
    }
    return product;
}
}