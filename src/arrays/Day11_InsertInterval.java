package arrays;

import java.util.ArrayList;
import java.util.List;

public class Day11_InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        //Creating a list for storing resulted Interval
        List<int[]> res = new ArrayList<>();
        //iterate over the intervals array
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i++]);
        }
        //merge overlapping intervals
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        //add newInterval to the list
        res.add(newInterval);
        //add remaining intervals
        while (i < intervals.length) {
            res.add(intervals[i++]);
        }
        return res.toArray(new int[0][]);
    }
}
