package arrays;

public class Day5_FindDuplicate {

//287. Find the Duplicate Number

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 5, 6};
        System.out.println(findDuplicate(arr));

    }

    /* Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
     * There is only one repeated number in nums, return this repeated number.
     * You must solve the problem without modifying the array nums and uses only constant extra space.*/
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }


}








