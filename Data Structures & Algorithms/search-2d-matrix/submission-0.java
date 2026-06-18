class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bottom = row - 1;

        while (top <= bottom) {
            int m = (top + bottom) / 2;
            if (target > matrix[m][col - 1]) {
                top = m + 1;
            } else if (target < matrix[m][0]) {
                bottom = m - 1;
            } else {
                break;
            }
        }

        if (!(top <= bottom)) {
            return false;
        }

        int rows = (top + bottom) / 2;

        int left = 0;
        int right = col - 1;

        while (left <= right) {
            int m = (left + right) / 2;

            if (target > matrix[rows][m]) {
                left = m + 1;
            } else if (target < matrix[rows][m]) {
                right = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
