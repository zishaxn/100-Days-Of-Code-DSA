package arrays;
//53. Maximum Sub array
public class Day9_MaximumSubArray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = nums[0];
        for (int i : nums) {
            sum = sum + i;
            maxSum = Math.max(sum, maxSum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
