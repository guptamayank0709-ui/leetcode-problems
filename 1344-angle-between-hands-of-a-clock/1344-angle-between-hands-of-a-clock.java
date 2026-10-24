class Solution {
    public double angleClock(int hour, int minutes) {
        double h = hour;
        double cntAmin = 6*minutes;
        double ans = 0;
        if(hour==12){
            h = 0.5*minutes;
        }
        h = 30*hour + 0.5*minutes;
        ans = Math.min(Math.abs(cntAmin-h),360-Math.abs(cntAmin-h));
        return ans;
    }
}