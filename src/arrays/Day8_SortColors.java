package arrays;

import java.util.Arrays;

public class Day8_SortColors {

    //75. Sort Colors
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 2, 1, 0, 0, 2, 1, 1};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        int temp;
        while (mid <= high) {
            if (nums[mid] == 0) {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

