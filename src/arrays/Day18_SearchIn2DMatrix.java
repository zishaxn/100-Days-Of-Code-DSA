package arrays;

public class Day18_SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(isPresent(matrix, 16));
    }

    private static boolean isPresent(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int lo = 0;       //Start limit to be used as 1D array
        int hi = (m * n) - 1; //upper limit to be used as 1D array
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (matrix[mid / n][mid % n] == target) {
                return true;
            } else if (matrix[mid / n][mid % n] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return false;
    }
}
