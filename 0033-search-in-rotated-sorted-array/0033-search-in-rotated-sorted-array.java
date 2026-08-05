class Solution {
    public int search(int[] nums, int target) {
        
        int pivot = findpivot(nums);

        // Case 1: Array is not rotated
        if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        // Case 2: Pivot itself is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // Case 3: Target is in the left sorted portion
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }

        // Case 4: Target is in the right sorted portion
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
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
        return -1; // Array is not rotated
    }
    int binarysearch(int[] nums, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    

}