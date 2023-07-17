package mandatoryHomeWork.week12.day1;

import java.util.HashMap;

public class SomorphicStrings_205 {

    /**
     *
     *  Approach - Hashing
     *
     *  Pseudo Code
     *  1. create a two hashmap
     *  2. Iterate each character and increment the count of character which is repeating
     *  3. Sort the arrays of value from the hashmap
     *  4. Compare both the hasmap and if matches return true or false
     *
     */

    public static void main(String[] args) {
       String s = "bbbaaaba", t = "aaabbbba";
        System.out.println(isIsomorphic(s,t));
    }
    public static boolean isIsomorphic(String s, String t) {

        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        if(s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if(arr1[s.charAt(i)] != arr2[t.charAt(i)]){
                return false;

            } else{
                arr1[s.charAt(i)] = i+1;
                arr2[t.charAt(i)] = i+1;
            }
        }

        return true;

    }
    public static boolean isIsomorphic1(String s, String t) {

        HashMap<Character, Integer> hashS = new HashMap<>();
        HashMap<Character, Integer> hashT = new HashMap<>();

        char[] strS = s.toCharArray();
        char[] strT = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            hashS.put(strS[i], hashS.getOrDefault(strS[i], 0)+1);
            hashT.put(strT[i], hashT.getOrDefault(strT[i], 0)+1);
        }

        if(hashS.size() == hashT.size()){
            return true;
        }
        return false;
    }
}
