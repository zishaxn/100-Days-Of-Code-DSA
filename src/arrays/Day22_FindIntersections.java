/*        Intersection of Two Arrays II
        Send Feedback
        You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
        Note :
        Input arrays/lists can contain duplicate elements.

        The intersection elements printed would be in the order they appear in the first array/list(ARR1)


        Input format :
        The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

        First line of each test case or query contains an integer 'N' representing the size of the first array/list.

        Second line contains 'N' single space separated integers representing the elements of the first the array/list.

        Third line contains an integer 'M' representing the size of the second array/list.

        Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
        Output format :
        For each test case, print the intersection elements in a row, separated by a single space.

        Output for every test case will be printed in a separate line.
        Constraints :
        1 <= t <= 10^2
        0 <= N <= 10^3
        0 <= M <= 10^3
        Time Limit: 1 sec
        Sample Input 1 :
        2
        6
        2 6 8 5 4 3
        4
        2 3 4 7
        2
        10 10
        1
        10
        Sample Output 1 :
        2 4 3
        10
        Sample Input 2 :
        1
        4
        2 6 1 2
        5
        1 2 3 4 2
        Sample Output 2 :
        2 1 2
        Explanation for Sample Output 2 :
        Since, both input arrays have two '2's, the intersection of the arrays also have two '2's.
        The first '2' of first array matches with the first '2' of the second array. Similarly,
        the second '2' of the first array matches with the second '2' if the second array.
        */


package arrays;

import java.util.HashMap;

public class Day22_FindIntersections {
    public static void main(String[] args) {
        int[]arr={2, 6 ,1 ,2};
        int[]arr1={1, 2, 3, 4, 2};
        intersections(arr,arr1);
    }
    public static void intersections(int[] arr1, int[] arr2) {
        for (int k : arr1) {
            for (int j = 0; j < arr2.length; j++) {
                if (k == arr2[j]) {
                    System.out.print(k + " ");
                    arr2[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }

    }
    public static void intersections2(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int j : arr1) {
            map.put(j, 1);
        }
        for (int k : arr2) {
            if (map.containsKey(k)) {
                int j = map.get(k);
                map.put(k, j++);
            }
        }
       

    }
}