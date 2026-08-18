class Solution {
    public double average(int[] salary) {
       double avgsal = 0;
        int maxsal = salary[0];
        int minsal = salary[0];
        for (int idx = 0; idx < salary.length; idx++) {
            maxsal = Math.max(salary[idx],maxsal);
            minsal = Math.min(salary[idx], minsal);

        }
         int sum = 0;
         for (int i = 0; i < salary.length; i++) {
            sum+= salary[i];
         }   
         avgsal = (double)(sum-(minsal+maxsal))/(salary.length-2);
         return avgsal;
    }
}