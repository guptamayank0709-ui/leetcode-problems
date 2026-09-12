class Solution {
    public int maximumGap(int[] nums) {
       if(nums.length<2){
        return 0;
       } 
       Arrays.sort(nums);
       int[] ans = new int[nums.length];
       for(int i = 0;i<nums.length-1;i++){
        ans[i] = nums[i+1]-nums[i];
       }
       int answ = ans[0];
       for(int j = 1;j<ans.length;j++){
        answ = Math.max(ans[j],answ);
       }
       return answ;
    }
   
    }
