package test;

public class ImageSourcePicker {
    static int arr1[] = {1, 2, 3, 4, 5};
    static int arr2[] = {1, 2, 3, 4};

    public static void main(String []args) {

        int x = arr1[0];
        int y = arr2[0];

        for(int i = 1; i < arr1.length; i++) {
            x = x ^ arr1[i];
        }

        for(int i = 1; i < arr2.length; i++) {
            y = y ^ arr2[i];
        }

        System.out.println(x^y);
    }
}