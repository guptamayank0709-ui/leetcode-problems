class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
    while(i<nums.length){
         int correct = nums[i] - 1;
         if(nums[i]!=nums[correct]){
            swap(nums,i,correct);

         }else{
            i++;
         }
        }
        int[] ans = new int[2];
        for (int idx = 0; idx < nums.length; idx++) {
            if(nums[idx]!=idx+1){
               ans[0] = nums[idx];
               ans[1] = idx+1;
            }
           }
         return ans ;
         
    }
    void swap(int[] nums,int a,int b){
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}
}