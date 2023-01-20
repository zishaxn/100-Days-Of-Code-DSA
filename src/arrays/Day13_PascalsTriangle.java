package arrays;

import java.util.ArrayList;
import java.util.List;
//118. Pascal's Triangle
public class Day13_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    int prevTwoElementsAddition = res.get(i - 2).get(j) + res.get(i - 2).get(j - 1);
                    row.add(prevTwoElementsAddition);
                }
            }
            res.add(row);
        }
        return res;
    }
}
