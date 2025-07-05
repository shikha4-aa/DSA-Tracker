//Link: https://leetcode.com/problems/word-search/
//Problem: Given an m x n grid of characters board and a string word, return true if word exists in the grid.

class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j< cols; j++){
                if(dfs(board, word, 0, i, j)){
                    return true;
                }
            }
            
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int i, int j){
        if(index == word.length()){
            return true;
        }

        if(i<0 || j<0 || i>= board.length || j>=board[0].length){
            return false;
        }

        if(board[i][j]!= word.charAt(index)){
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found = dfs(board, word, index+1, i+1, j) || dfs(board, word, index+1, i-1, j) || dfs(board, word, index+ 1, i,j+1) || dfs(board, word, index+1, i, j-1);

        board[i][j] = temp;

        return found;


    }

}