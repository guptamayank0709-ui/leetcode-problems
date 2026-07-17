class Solution {
    public int[] runningSum(int[] nums) {
        int[] nums2 = new int[nums.length];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<=i;j++){
                sum = sum+nums[j];
            }
            nums2[i] = sum;
            sum= 0;
        }
        return nums2;
    }
}