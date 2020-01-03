package test;

import java.util.regex.Pattern;

public class MainClass {

    public static void main(String[] args) {
        String str = "My name is Ritesh";

        Pattern pattern = Pattern.compile("\\s");
        String[] arr = pattern.split(str);

        for(int i = 0; i< arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }

        System.out.println();

        for(int i = arr.length-1; i >=0; i--) {
            System.out.print("\t" + arr[i]);
        }

        System.out.println();
        System.out.println((int) 'c');
        System.out.println((char) 99);
    }
}
