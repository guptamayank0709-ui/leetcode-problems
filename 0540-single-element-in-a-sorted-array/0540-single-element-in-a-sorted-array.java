class Solution {
    public int singleNonDuplicate(int[] nums) {
    int ans = 0;
    for(int i = 0;i<nums.length;i++){
        ans = ans^nums[i];
    }
    // wanna see how to do it using binary search 
    return ans;
    }
}