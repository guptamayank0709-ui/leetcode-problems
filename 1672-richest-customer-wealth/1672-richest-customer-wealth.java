class Solution {
    public int maximumWealth(int[][] nums) {
        int ans = Integer.MIN_VALUE;
    for (int row = 0; row <nums.length ; row++) {
        int sum = 0;
        for(int col=0;col<nums[row].length;col++){
            sum = sum+nums[row][col];
        }
        if(sum>ans){
            ans = sum;
        }
    }

    return ans;
    }
}