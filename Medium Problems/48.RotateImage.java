class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length, temp;
        for (int i = 0; i < row; i++) {
            for (int j = i; j <col; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;                 
            }
        }
        for (int i = 0; i < col; i++) {
            for(int j = 0; j < row/2; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][row-j-1];
                matrix[i][row-j-1] = temp;
                 // System.out.print(matrix[i][j] + " ");
            }
             // System.out.println();
        }
    }
}