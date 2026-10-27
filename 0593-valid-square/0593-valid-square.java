class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
       int[] arr = new int[6];
       arr[0] = distance(p1,p2);
       arr[1] = distance(p1,p3);
       arr[2] = distance(p1,p4);
       arr[3] = distance(p2,p3);
       arr[4] = distance(p2,p4);
       arr[5] = distance(p3,p4);
       
       
       Arrays.sort(arr);

        return arr[0] > 0 &&                 // side length cannot be 0
               arr[0] == arr[1] &&
               arr[1] == arr[2] &&
               arr[2] == arr[3] &&           // 4 equal sides
               arr[4] == arr[5] &&           // 2 equal diagonals
               arr[4] == 2 * arr[0];         // diagonal² = 2 × side²
    }
    
    int distance(int[] p1,int[]p2){
        return ((p1[0]-p2[0])*(p1[0]-p2[0]) + (p1[1]-p2[1])*(p1[1]-p2[1]));
    }
}