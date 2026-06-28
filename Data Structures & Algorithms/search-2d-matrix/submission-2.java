class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int st = 0, ed = m * n - 1;

        while (st<=ed) {
            int mid = (st + ed) /2;
            int mv = matrix[mid/n][mid%n];
            if (mv == target)
                return true;
            else if (mv < target)
                st++;
            else
                ed--;

        }
        return false;
    }
}
