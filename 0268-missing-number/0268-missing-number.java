class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
    while(i<nums.length){
        int correct = nums[i];
        if(nums[i]<nums.length&&nums[i]!=nums[correct]){
            swap(nums,correct,i);
        }else{
            i++;
        }
    }
    for (int j = 0; j < nums.length; j++) {
        if(nums[j]!=j){
            return j;
        }
    }
    return nums.length;
        

    }
    void swap(int[] nums,int a,int b){
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
}
}