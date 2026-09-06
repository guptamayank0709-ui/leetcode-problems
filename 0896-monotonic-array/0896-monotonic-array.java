class Solution {
    public boolean isMonotonic(int[] nums) {
        return isinc(nums , 0)||isdec(nums,0);
    }
   private boolean isinc(int[] nums , int index){
        if(index ==nums.length-1){
            return true;
        }
        return nums[index]<=nums[index+1]&&isinc(nums,index+1);
    }
    private boolean isdec(int[] nums , int index){
        if(index ==nums.length-1){
            return true;
        }
        return nums[index]>=nums[index+1]&&isdec(nums,index+1);
    }
}