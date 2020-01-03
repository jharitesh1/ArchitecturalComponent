package test;

import java.util.Arrays;
import java.util.HashSet;

public class MaxElementFromRight {
    static int arr[] = {7, 3, 5, 4, 1};


    public static void main(String[] args) {

        int length = arr.length-1;
        int max = arr[length];
        int temp = 0;
        arr[length] = -1;

        for(int i = length-1; i >= 0; i--) {
          //  System.out.println(arr[i]);
            temp = arr[i];

           // System.out.println(arr[i] + " : " + max);

            arr[i] = max;

            if(max < temp) {
                max = temp;
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}