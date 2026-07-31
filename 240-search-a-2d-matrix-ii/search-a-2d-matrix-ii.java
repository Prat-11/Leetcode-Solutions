class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = 0;
        int col = matrix[0].length-1;
        while(rows<matrix.length && col>=0){
            if(matrix[rows][col]==target) return true;
            if(matrix[rows][col]>target) col--;
            else rows++;
        }
        return false;
    }
}