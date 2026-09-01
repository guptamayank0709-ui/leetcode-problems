class Solution {
    public int heightChecker(int[] heights) {
        int[] h2 = new int[heights.length];
       for(int j = 0;j<heights.length;j++){
        h2[j] = heights[j];
       }
        int count = 0;
        Arrays.sort(heights);
        for(int i =0;i<heights.length;i++){
            if(h2[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}