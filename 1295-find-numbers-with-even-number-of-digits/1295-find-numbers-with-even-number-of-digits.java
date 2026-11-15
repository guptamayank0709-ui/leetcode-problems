class Solution {
    public int findNumbers(int[] nums) {
        int ec = 0;
        for(int i = 0;i<nums.length;i++){
            if(evencount(nums[i])==true){
                ec++;
            }
        }
    return ec;
    }

    boolean evencount(int n){
        return (int)(Math.log10(n)+1)%2 == 0;
    }
}