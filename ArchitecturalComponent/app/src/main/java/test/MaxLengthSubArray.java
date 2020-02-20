package test;

import java.util.Map;
import java.util.HashMap;

class MaxLengthSubArray
{
    // Find maximum length sub-array with sum S present in the given array
    public static void maxLengthSubArray(int[] A, int S)
    {
        // create an empty Hash Map to store ending index of first
        // sub-array having some sum
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("Array : { 6, -5, 5, 3, 5, 3, -2, 0 } " );
        // insert (0, -1) pair into the set to handle the case when
        // sub-array with sum S starts from index 0
        map.put(0, -1);

        int sum = 0;

        // len stores the maximum length of sub-array with sum S
        int len = 0;

        // stores ending index of maximum length sub-array having sum S
        int ending_index = -1;

        // traverse the given array
        for (int i = 0; i < A.length; i++)
        {
            // sum of elements so far
            sum += A[i];

            System.out.println("Sum : " + sum + " -- map : " + map);

            // if sum is seen for first time, insert sum with its index
            // into the map
            map.put(0, -1);

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // update length and ending index of maximum length sub-array
            // having sum S
            if (map.containsKey(sum - S) && len < i - map.get(sum - S))
            {
                System.out.println("Sum : " + sum + " -- S : " + S + "  len : " + len + " -- i : " + i + " -- (sum - S) : " + (sum - S) + "  map.get(sum - S) : " + map.get(sum - S));
                len =  i - map.get(sum - S);
                ending_index = i;
            }
        }

        // print the sub-array
        System.out.println("[" + (ending_index - len + 1) + ", "
                + ending_index + "]");
    }

    // main function
    public static void main (String[] args)
    {
        int[] A = { 6, -5, 5, 3, 5, 3, -2, 0 };
        int sum = 8;

        maxLengthSubArray(A, sum);
    }
}