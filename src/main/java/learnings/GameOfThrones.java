package learnings;

import java.util.HashMap;

public class GameOfThrones {

    public static void main(String[] args) {
       String s = "cdefghmnopqrstuvw";


        HashMap<Character, Integer> map = new HashMap<>();


        for(int i=0; i< s.length(); i++){

          map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);


        }

        int counter =0;
        for(Integer val : map.values()){

            if(val % 2 != 0){
                counter++;
            }

        }
        if(counter > 1){
            System.out.println("no");
        } else{
            System.out.println("Yes");
        }

//        System.out.println();

    }
}
