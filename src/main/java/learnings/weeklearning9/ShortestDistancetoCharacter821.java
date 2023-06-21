package learnings.weeklearning9;

import org.junit.Test;

public class ShortestDistancetoCharacter821 {


    @Test
    public void shortDist(){
       String s = "loveleetcode";
       char c = 'e';

       System.out.println(Integer.MAX_VALUE-1);

        int left = 0, right = 0;

        while(right < s.length()){

            if(s.charAt(right) == c){
                int end = right;
                while(end >= left){

                    System.out.println(end - left);
                    end--;
                }
                left = right+1;
            }

            right++;
        }

    }
}
