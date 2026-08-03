class Solution {
    public int[] twoSum(int[] num, int target) {
        int idx1= 0;
        int idx2 = num.length -1;
        while(idx1<=idx2){
            if(num[idx1]+num[idx2]==target){
                return new int[]{idx1+1,idx2+1};
            }if(num[idx1]+num[idx2]>target){
                idx2--;
            }else{
                idx1++;
            }
        }
        return new int[]{-1,-1};
    }
}