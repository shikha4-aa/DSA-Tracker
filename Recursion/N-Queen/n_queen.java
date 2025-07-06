//Link: https://leetcode.com/problems/n-queens/

import java.util.*;
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for(int i = 0; i<n; i++){
            Arrays.fill(board[i], '.');
        }

        backtrack(0, board, result, n);
        return result;

    }


    private void backtrack(int col, char[][] board, List<List<String>> result, int n){
        if(col == n){
            result.add(construct(board));
            return;
        }

        for(int row = 0; row<n; row++){
            if(isSafe(board, row, col, n)){
                board[row][col] = 'Q';
                backtrack(col+ 1, board, result, n);
                board[row][col] = '.';
            }
        }
    }


    private boolean isSafe(char[][] board, int row, int col, int n){

        //check left 
        for(int j =0; j<col; j++){
            if(board[row][j]== 'Q') return false;
        }


        //check left upper 
        for(int i = row -1, j= col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q') return false;
        }

         for (int i = row + 1, j = col - 1; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }


    private List<String> construct(char[][] board){
        List<String> result = new ArrayList<>();
        for(char[] row: board){
            result.add(new String(row));
        }
        return result;
    }
}