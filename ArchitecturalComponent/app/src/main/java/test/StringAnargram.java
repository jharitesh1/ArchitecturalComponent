package test;

public class StringAnargram {

    public static void main(String[] args) {

        String str1 = "abca";
        String str2 = "baca";

        checkAnargram(str1, str2);
    }

    private static void checkAnargram(String s1, String s2) {
        int[] arrList1 = new int[26];
        int[] arrList2 = new int[26];
        int position = 0;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        int char_to_int;
        int diff_value = 0;

        for (int i = 0; i < arr1.length; i++) {
            char_to_int = (int) arr1[i];
            diff_value = char_to_int - (int)'a';
            arrList1[diff_value]++;

           // System.out.println(arr1[i] + " : " + char_to_int);


        }

        for (int i = 0; i < arr2.length; i++) {
            char_to_int = (int) arr2[i];
            diff_value = char_to_int - (int)'a';
            arrList2[diff_value]++;

            //System.out.println(arr2[i] + " : " + char_to_int);
        }

        boolean flag = false;

        for (int i = 0; i < 26; i++) {
            if(arrList1[i] == arrList2[i]) {
                //System.out.println(arrList1[i] + " equals " + arrList2[i]);
                continue;
            }
            else {
                flag = true;
                break;
            }

        }

        if(flag) {
            System.out.print("No anargram");
        }
        else{
            System.out.print(" anargram");
        }


    }
}
