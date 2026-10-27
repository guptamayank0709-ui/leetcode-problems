class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = weights[0];
        int high = weights[0];
      for(int i =1;i<weights.length;i++){
        if(weights[i]>low){
            low = weights[i];
        }
            high+=weights[i];
      }

        while(low<=high){
            int mid = low + (high-low)/2;
            if(getDays(weights,mid)<=days){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
    return low;
      } 

      
    
    int getDays(int[] weights, int capacity) {
    int days = 1;
    int currentLoad = 0;

    for (int weight : weights) {
        if (currentLoad + weight <= capacity) {
            currentLoad += weight;
        } else {
            days++;
            currentLoad = weight;
        }
    }

    return days;
}
    
}