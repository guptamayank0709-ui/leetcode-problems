class Solution {
    public int[] sumZero(int n) {
       int[] arr = new int[n];
        int idx = 0;
        
        // if n is odd, place a 0 first
        if (n % 2 != 0) {
            arr[idx++] = 0;
        }
        
        // fill remaining slots in +/- pairs
        for (int i = 1; idx < n; i++) {
            arr[idx++] = i;
            arr[idx++] = -i;
        }
        
        return arr;

            

    }
}