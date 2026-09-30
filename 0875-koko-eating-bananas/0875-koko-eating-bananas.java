class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for(int p:piles){
            high = Math.max(high,p);
        }

        while(low<high){
            int mid = low + (high-low)/2;

            if (canFinish(piles, mid, h)) {
                high = mid;        // mid works, try smaller
            } else {
                low = mid + 1;     // mid too slow, go higher
            }
        }
        return low;
    }
    private boolean canFinish(int[] piles,int k,int h){
         long hours = 0;            // long to avoid overflow
        for (int p : piles) {
            hours += (p + k - 1) / k;
        }
        return hours <= h;
    }

        }
        
    