package arrays;

import java.util.HashMap;

public class Day3_MissingNumber {

//268. Missing Number

        public static void main(String[] args) {
            int []arr = {1,2,3,0,4};
            System.out.println(missingNumber(arr));

        }
        /* Given an array nums containing n distinct numbers in the range [0, n],
         * return the only number in the range that is missing from the array.*/

        /* Input: nums = [3,0,1]
           Output: 2
           Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
           2 is the missing number in the range since it does not appear in nums.*/
        public static int missingNumber(int[] nums) {
            HashMap<Integer,Integer>map = new HashMap<>();
            for(int i =0;i<nums.length;i++) {
                map.put(nums[i],1);
            }
            for(int i =1;i<=nums.length;i++) {
                if(!map.containsKey(i)) {
                    return i;
                }
            }
            return -1;
        }

    }
