class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix[0][0]==target){
            return true;
        }
        long left = 0;
        long right = matrix[0].length*matrix.length-1;
        while (left!=right){
            int middle = (int)((left+right+1)/2);
            if (matrix[middle/matrix[0].length][middle%matrix[0].length]==target){
                return true;
            }
            if (matrix[middle/matrix[0].length][middle%matrix[0].length]<target){
                left = middle;
            }
            if (matrix[middle/matrix[0].length][middle%matrix[0].length]>target){
                right = middle-1;
            }
        }
        return false;
    }
}
