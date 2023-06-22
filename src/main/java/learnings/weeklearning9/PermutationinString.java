package learnings.weeklearning9;

import org.testng.annotations.Test;

public class PermutationinString {


    @Test
    public void pp(){
        String s1 = "ab", s2 = "eidbaooo";

        StringBuilder bd = new StringBuilder();
        int len = s1.length();
        int left = 0, right = len;
        for (int i = 0; i < len; i++) {
            bd.append(s2.charAt(i));
        }

        while(right < s2.length()){

//            if(){
//
//            }

            right++;
        }
        System.out.println(bd);
    }
}
