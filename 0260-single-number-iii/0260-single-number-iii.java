class Solution {
    public int[] singleNumber(int[] nums) {
       Arrays.sort(nums);

      if (nums.length < 3) {
            return nums;
        }
        Arrays.sort(nums);
        int[] ans = new int[2];
        int idx = 0;

        if (nums[0] != nums[1]) {
            ans[idx++] = nums[0];
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            ans[idx++] = nums[nums.length - 1];
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                ans[idx++] = nums[i];
            }
        }
        return ans;

        
    }
}