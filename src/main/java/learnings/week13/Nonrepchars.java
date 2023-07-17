package learnings.week13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Nonrepchars {


    public static void main(String[] args) {
       String s = "eetts code";

        LinkedHashMap<Character, Integer> llp = new LinkedHashMap<>();
        HashSet<Character> set = new HashSet<>();

        char[] sc = s.toCharArray();
        int maxCount = 0;
        for (int i = 0; i < sc.length; i++) {
            llp.put(sc[i], llp.getOrDefault(sc[i],0)+1);
        }

        System.out.println(llp);
        char fin = 0;
        System.out.println(fin);
        for(HashMap.Entry<Character, Integer> entry : llp.entrySet()){
            if (entry.getValue() == 1){
                fin = entry.getKey();
                System.out.println("second" + fin);
                break;
            }
        }

        for (int i = 0; i < sc.length; i++) {
              if(sc[i] == fin){
                  System.out.println(i);
                  return;
              }
        }

    }

    public void driver(){
//        WebDriverWait wait = new WebDr
    }


}

