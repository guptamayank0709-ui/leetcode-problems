class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        long ans = 0;
        Arrays.sort(nums);
        if(nums.length%2==0){
            for(int i = 0;i<nums.length/2;i++){
                ans = ans +nums[nums.length-i-1] - 
                nums[i];
            }
        }else{
            int mid = (nums.length-1)/2;
            for(int i = 0;i<mid;i++){
                ans = ans+ nums[nums.length-i-1] - nums[i];
                
            }
            ans = ans +nums[mid];
        }
        return ans;
    }
}