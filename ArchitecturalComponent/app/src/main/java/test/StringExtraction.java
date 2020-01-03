package test;

import java.util.Stack;

public class StringExtraction {
    static String str = "Ritesh";
    static Stack<Character> stack = new Stack<>();

    public static void main(String []args) {

        System.out.println("string");

        for (int i = 0; i < str.length(); i++) {
            System.out.print("\t" + str.charAt(i));
            stack.push(str.charAt(i));
        }

        System.out.println();
        System.out.println("string reverse");


        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print("\t" + str.charAt(i));
        }

        System.out.println();
        System.out.println("stack reverse");

        while(!stack.isEmpty()) {
            System.out.print("\t" +stack.pop());
        }
    }
}