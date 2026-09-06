class Solution {
    public int findMin(int[] nums) {
    //    int min = nums[0];
    //    for(int i = 1;i<nums.length;i++){
    //     if(nums[i]<min){
    //         min = nums[i];
    //     }
    //    }
    //     return min;
        // now let's try to optimise it to O(log n)
        return nums[(findpivot(nums)+1)%nums.length];
        
    }
     int findpivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is pivot
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Decide which half to search next
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
     }
}
