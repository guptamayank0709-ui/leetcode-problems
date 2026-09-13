class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
      int start = 0;
      int end = citations.length-1;
      while(start<=end){
        int mid = start + (end-start)/2;
        int countaftermid = n-mid;
        if(citations[mid]>=countaftermid){
            end = mid-1;
        }
        else{
            start = mid+1;
        }
      }  
        return n - start;
    }
}