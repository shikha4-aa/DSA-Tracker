//Probllem: Sudoku Solver
// Difficulty: Hard

/*A sudoku solution must satisfy all of the following rules:

Each of the digits 1-9 must occur exactly once in each row.
Each of the digits 1-9 must occur exactly once in each column.
Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
The '.' character indicates empty cells.*/

// LeetCode Problem: https://leetcode.com/problems/sudoku-solver/

class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board){
        for(int row = 0; row<9; row++){
            for(int col = 0; col<9; col++){
                if(board[row][col]=='.'){
                    for(char c = '1'; c<='9'; c++){
                        if(isValid(board, c, row, col)){
                            board[row][col] = c;

                            if(solve(board)) return true;

                            board[row][col] = '.'; //backtrack
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    private boolean isValid(char[][] board, char c, int row, int col){
        for(int i = 0; i<9; i++){
            if(board[row][i]== c){
                return false;
            }

            if(board[i][col] == c){
                return false;
            }

            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;
            if (board[boxRow][boxCol] == c) {
                return false;
            }
        }
        return true;
    }
}