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
        int temp = 0;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0: {
                    temp = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}

