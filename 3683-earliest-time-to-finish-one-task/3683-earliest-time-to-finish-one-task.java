class Solution {
    public int earliestTime(int[][] tasks) {
        int countmin = Integer.MAX_VALUE;
        int time = 0;
        for(int i = 0;i<tasks.length;i++){
            time = tasks[i][0]+tasks[i][1];
            countmin = Math.min(time,countmin);
        }
        return countmin;
    }
}