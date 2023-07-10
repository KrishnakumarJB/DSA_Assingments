package learnings.week11;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    /**
     * Approach - Sliding Window
     *
     * 1. Initilaze a left and right varibale
     * 2. create a while loop till right lesser than the length of string
     * 3.Create a another while loop inside the while loop traverse till the charcater is not repeasted
     *  if repeated return the count.
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {
      String  s = "abcabcbb";

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static  int lengthOfLongestSubstring(String s) {


        Set<Character> set = new HashSet<>();
        int left = 0, right = 0;

        char[] sChar = s.toCharArray();
        int count =0, max = 0;

        for(right = 0; right < sChar.length; right++){

            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                max=Math.max(max,right-left+1);

            }else{
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
//            right++;
        }
        return max;
    }
}
