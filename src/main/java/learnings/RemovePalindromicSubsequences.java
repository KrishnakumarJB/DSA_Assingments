package learnings;

import org.junit.Test;

public class RemovePalindromicSubsequences {


    @Test
    public void rem(){

        String s = "ababa";



        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(s);
        System.out.println(s.length());
        for (int i = s.length()-1; i >= 0 ; i--) {
            sb.append(s.charAt(i));
        }
            System.out.println(sb.toString());
        String one = sb.toString();
        if(one.equals(s)){
            System.out.println(1);
        }else{
            System.out.println(2);
        }
//        System.out.println(count);
    }
}
