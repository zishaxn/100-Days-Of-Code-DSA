package arrays;

import java.util.PriorityQueue;

//215. Kth Largest Element in an Arra
public class Day2_KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i =0;i<k;i++){
            minHeap.add(nums[i]);
        }
        for(int i =k;i<n;i++){
            if(nums[i]>minHeap.peek()){
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        return minHeap.peek();
    }

}
