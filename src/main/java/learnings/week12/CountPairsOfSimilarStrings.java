package learnings.week12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountPairsOfSimilarStrings {


    public static void main(String[] args) {

        String[] words = {"aba","aabb","abcd","bac","aabc"};
        System.out.println(similarPairs(words));
    }


    public static int similarPairs(String[] words) {

        HashMap<String,Integer> wordsMap = new HashMap<>();

        for(String wordStr : words){
//            wordsMap.put(wordStr, wordsMap.getOrDefault(wordStr,0)+1);
            char[] ch = wordStr.toCharArray();
            Arrays.sort(ch);
            String one = new String(ch);
            System.out.println(one);
            wordsMap.put(one, wordsMap.getOrDefault(one,0)+1);
        }
        System.out.println(wordsMap);
        int count = 0;
        for(Map.Entry<String, Integer> entry : wordsMap.entrySet()){
//            entry.getKey().contains(wordsMap.get())
            if(entry.getValue() > 1){
                count++;
            }
        }


        return count;

    }
}
