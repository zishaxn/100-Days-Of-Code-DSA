package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

//31.Next Permutation
public class Day15_NextPermutation {
    public static void main(String[] args) {
        int[]arr = {5,4,3,2,1};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        int lastIndex = nums.length-2;
        while(lastIndex>=0 && nums[lastIndex]>=nums[lastIndex+1])lastIndex--;
        if(lastIndex>=0){
            int swapIndex = nums.length-1;
            while(nums[swapIndex]<=nums[lastIndex]){
                swapIndex--;
            }
            swap(nums,swapIndex,lastIndex);
        }
        reverse(nums,lastIndex+1,nums.length-1);
    }

    private static void swap(int[] nums, int swapIndex, int lastIndex) {
        int temp = nums[swapIndex];
        nums[swapIndex]=nums[lastIndex];
        nums[lastIndex]=temp;
    }

    private static void reverse(int[] nums, int i,int j) {
        while(i<j){
            swap(nums,j,i);
            i++;
            j--;
        }
    }
}
