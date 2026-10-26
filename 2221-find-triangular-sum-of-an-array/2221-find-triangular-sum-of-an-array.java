class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int n = nums.length;
        int[] newNums = new int[n];
        for(int i = 0;i<nums.length;i++){
            newNums[i] = nums[i];
        }
        while(n!=1){
            for(int i = 0;i<n-1;i++){
                newNums[i] = (newNums[i]+newNums[i+1])%10;
            }
            n--;
        }
        return newNums[0];
    }
}