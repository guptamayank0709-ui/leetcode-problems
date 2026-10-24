class Solution {
    public int maxAbsoluteSum(int[] nums) {
      return Math.max(maxSubArray(nums),Math.abs(minSubArray(nums)));  
    }
    int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = nums[0];
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            maxsum = Math.max(maxsum,sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }

    int minSubArray(int[] nums) {
        int sum = 0;
        int minsum = nums[0];
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            minsum = Math.min(minsum,sum);
            if(sum>0){
                sum=0;
            }
        }
        return minsum;
    }
}