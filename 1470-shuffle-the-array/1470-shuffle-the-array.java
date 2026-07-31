class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] nums2 = new int[2*n];
        for(int i =0;i<n;i++){
            nums2[2*i] = nums[i];
            nums2[2*i+1] = nums[i+n];
        }
        return nums2;
    }
}