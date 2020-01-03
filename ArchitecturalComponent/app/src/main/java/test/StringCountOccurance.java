package test;

import java.util.HashMap;
import java.util.Iterator;

public class StringCountOccurance {
    static int count = 0;

    public static void main(String[] args)
    {
        String str = "ACCAAD";
        int len = str.length();
        System.out.println("string are: ");
        calculateOccurance(str);
    }

    private static void calculateOccurance(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
//        char []charArray = str.toCharArray();
        Character ch;
        int length = str.length();

        for(int i=0;i<length;i++) {
            ch = str.charAt(i);
            if(hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            }
            else {
                hashMap.put(ch, 1);
            }
        }

//        for(int i=0;i<charArray.length;i++) {
//            if(hashMap.containsKey(charArray[i])) {
//               hashMap.put(charArray[i], hashMap.get(charArray[i]) + 1);
//            }
//            else {
//                hashMap.put(charArray[i], 1);
//            }
//        }

        Iterator iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}