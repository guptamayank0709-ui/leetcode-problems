class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        return queens(board,0);
    }
    int queens(boolean[][] board, int row){
        if(row==board.length){


            return 1;
        }
        int count = 0;

//        row wise checking
        for(int col =0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count+= queens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }
     private boolean isSafe(boolean[][] board, int row, int col) {
//    for vertical row
        for (int i = 0; i < row; i++) {
            if(board[i][col]){
                return false;
            }
        }
//        left diagonal
        int maxleft = Math.min(row,col);
        for (int i = 1; i <= maxleft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

//        now doing for right diagonal
        int maxright = Math.min(row, board.length-col-1);
        for (int i = 1; i <= maxright ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;

    }

}