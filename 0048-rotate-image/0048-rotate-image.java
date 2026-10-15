class Solution {
    public void rotate(int[][] matrix) {
       for(int i =0;i<matrix.length;i++){
        for(int j = i+1;j<matrix.length;j++){
            swap(matrix,i,j);
        }
       }
      for (int i = 0; i < matrix.length; i++) {
            int left = 0, right = matrix.length - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
    }
    }
    void swap(int[][] arr,int i,int j){
    int temp = arr[i][j];
    arr[i][j] = arr[j][i];
    arr[j][i] = temp;
    }
    
}


            