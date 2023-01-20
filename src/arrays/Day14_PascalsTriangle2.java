package arrays;

import java.util.ArrayList;
import java.util.List;

//119. Pascal's Triangle II
public class Day14_PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        if(rowIndex<0)return res;
        for(int i =0;i<=rowIndex;i++){
            res.add(1);
            for(int j =i-1;j>0;j--){
                res.set(j,res.get(j)+res.get(j-1));
            }
        }
        return res;
    }

}
