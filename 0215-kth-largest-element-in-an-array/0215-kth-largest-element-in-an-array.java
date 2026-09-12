class Solution {
    public int findKthLargest(int[] nums, int k) {
       if(k>nums.length){
        return -1;
       } 
       Arrays.sort(nums);
       return nums[nums.length-k];
    }
    // now we see how it can be done without sorting
}