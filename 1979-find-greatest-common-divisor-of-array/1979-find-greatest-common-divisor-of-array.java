class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int div = 1;
        for(int num:nums){
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        for(int i = 1;i<=min;i++){
            if(min%i !=0||max%i !=0){
                continue;
            }
            div = i;
        }
            
         return div;   
    }
}