class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];

        for(int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }

        int count = 0;

        for(int j = 0; j < nums.length; j++) {
            count += nums[j] - min;
        }

        return count;
    }
}