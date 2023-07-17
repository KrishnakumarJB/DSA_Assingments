package learnings.week13;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * Constrains: s and t consist of lowercase English letters.
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 */
public class AnagramEquals {


    public static void main(String[] args) {
        String s = "anagramm_1";
        String t = "nagaramM_1";

        anagramEquals(s, t);
        anagramEquals1(s, t);
    }

    public static boolean anagramEquals1(String one, String two){

        char[] arrOne = one.toCharArray();
        char[] arrTwo = two.toCharArray();


        if(arrTwo.length != arrOne.length){
            System.out.println("false");
            return false;
        }

        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);

        if(Arrays.equals(arrOne, arrTwo)){
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;

    }
    public static boolean anagramEquals(String one, String two){
        if(one.length() != two.length()){
            System.out.println("false");
            return false;
        }

            HashMap<Character, Integer> shm = new HashMap<>();
        HashMap<Character, Integer> thm = new HashMap<>();

        for(int i = 0; i < one.length(); i++){
            shm.put(one.charAt(i), shm.getOrDefault(one.charAt(i),0)+1);
            thm.put(two.charAt(i), thm.getOrDefault(two.charAt(i),0)+1);

        }
        if(shm.equals(thm)){
            System.out.println("true");
            return true;
        }

        System.out.println(shm);
        System.out.println(thm);
        System.out.println("false");
        return false;
    }
}













