class Solution {
    public boolean search(int[] nums, int target) {
//      return search(nums,target,0,nums.length-1);
// }
//     private boolean search(int[] arr, int target, int s, int e) {
//         if (s > e) {
//             return false;
//         }

//         int m = s + (e-s) / 2;
//        if(arr[s]==arr[m]&&arr[m]==arr[e]){
//         s++;
//         e--;
//        }
//         if (arr[m] == target) {
//             return true;
//         }

//         if (arr[s] <= arr[m]) {
//             if (target >= arr[s] && target <= arr[m]) {
//                 return search(arr, target, s, m-1);
//             } else {
//                 return search(arr, target, m+1, e);
//             }
//         }

//         if (target >= arr[m] && target <= arr[e]) {
//             return search(arr, target, m+1, e);
//         }

//         return search(arr, target, s, m-1);
    for(int num:nums){
        if(num==target){
            return true;
        }
    }
    return false;
    }
    }
