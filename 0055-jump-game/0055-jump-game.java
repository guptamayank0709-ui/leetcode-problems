class Solution {
    public boolean canJump(int[] nums) {
     int max_jumpindex = 0;
        
        for (int i = 0; i < nums.length; i++) {
            
            if (i > max_jumpindex) {
                return false;
            }
            
            
            max_jumpindex = Math.max(max_jumpindex, i + nums[i]);
            
            
            if (max_jumpindex > nums.length - 1) {
                return true;
            }
        }
        
        return true;   
    }
}