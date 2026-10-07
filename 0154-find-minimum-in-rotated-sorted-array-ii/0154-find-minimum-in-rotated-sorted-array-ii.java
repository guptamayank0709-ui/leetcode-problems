class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] > nums[right]) {
                // Minimum must be in the right half
                left = mid + 1;
            } else if (nums[mid] < nums[right]) {
                // Minimum must be in the left half (including mid)
                right = mid;
            } else {
                // When nums[mid] == nums[right], we cannot determine the direction.
                // We safely decrement right by 1 to narrow down the search space.
                right--;
            }
        }
        
        return nums[left];
    }
}
