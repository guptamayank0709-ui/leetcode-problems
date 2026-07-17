class Solution {
    public int[] buildArray(int[] nums) {
     int[] nums2 = new int[nums.length];
     for(int i = 0;i<nums.length;i++){
        nums2[i] = nums[nums[i]];
     }   
        return nums2;
    }
}