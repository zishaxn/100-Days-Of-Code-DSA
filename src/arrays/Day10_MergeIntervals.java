package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day10_MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{8,10}, {2,6}, {1,3}, {15,18}};
        int[][] result = merge(intervals);
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + "," + interval[1] + "]");
        }

    }
    public static int[][] merge(int[][] intervals) {
        //creating a list that will be used as 2D array while returning the ans.
        List<int[]> res = new ArrayList<>();

        //Checking if array is not empty
        if (intervals.length == 0) {
            return res.toArray(new int[0][]);
        }

        //comparing 1st element of ith Array with the next Array's first element
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        //using array at first as base case
        int start = intervals[0][0];
        int end = intervals[0][1];

        //iterating over each individual array and checking if 0th element of array is less than end element .
        for(int[]i:intervals){
            if(i[0]<=end){
                end=Math.max(end,i[1]); //assigning new end
            }
            else{
                res.add(new int[]{start,end}); //we have merged intervals till now so adding them in list array
                start=i[0];
                end=i[1];
            }
        }
        res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }
}
