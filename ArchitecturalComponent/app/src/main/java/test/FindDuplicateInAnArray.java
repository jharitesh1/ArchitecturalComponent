package test;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicateInAnArray {
    static int arr[] = {7, 3, 5, 4, 5};


    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        Arrays.sort(arr);

        System.out.println("Print : " + Arrays.toString(arr));

        for(int i = 0; i< arr.length; i++) {
            System.out.println(arr[i] + " : " + hashSet.add(arr[i]));
        }

        System.out.println(hashSet.toString());
    }
}