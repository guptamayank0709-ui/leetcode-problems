class Solution {
    public boolean check(int[] nums) {
    //    checking for sorted 
    return checkrotated(nums);
                

        
    }
    // private boolean helper(int[] arr , int index){
    //     if(index == arr.length -1){
    //         return true;

    //     }
    //     return arr[index]<arr[index+1] && helper(arr, index+1);
    // }
private boolean checkrotated(int[] arr){
  int n = arr.length;
        if (n <= 1) return true;

        int count = 0;
        for (int i = 0; i < n; i++) {
            // compare each element with the next, wrapping around at the end
            if (arr[i] > arr[(i + 1) % n]) {
                count++;
            }
            if (count > 1) return false;
        }
        return true;
    }
}
