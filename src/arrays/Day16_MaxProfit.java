package arrays;

import java.util.Arrays;

public class Day16_MaxProfit {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr));

    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i : prices) {
            if (i < minPrice) {
                minPrice = i;
            } else {
                maxProfit = Math.max(maxProfit, i - minPrice);
            }
        }
        return maxProfit;
    }


}
