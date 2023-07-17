package learnings.week12;

import java.util.*;

public class FindMaximumNumberofStringPairs {

    /**
     * Approach using Hashing
     *
     * Create a hashmap
     * add each values to it using forloop and while ading sort the string
     * print the max count in the hasmap using entryset
     *
     *
     */

    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
//        System.out.println(maximumNumberOfStringPairs(words));
        System.out.println(maximumNumberOfStringPairsSet(words));
    }

    public static int maximumNumberOfStringPairsSet(String[] words) {

        HashSet<String> hhset = new HashSet<>();

        for (String str : words){
            hhset.add(str);
        }
        Iterator<String> iterator = hhset.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
//            if(iterator.){
//
//            }
        }
//        System.out.println(iterator);


        return 0;
    }

    public static int maximumNumberOfStringPairs(String[] words) {

        HashMap<String,Integer> wordsMap = new HashMap<>();

        for(String wordStr : words){
//            wordsMap.put(wordStr, wordsMap.getOrDefault(wordStr,0)+1);
            char[] ch = wordStr.toCharArray();
            Arrays.sort(ch);
            String one = new String(ch);
            System.out.println(ch);
            wordsMap.put(one, wordsMap.getOrDefault(one,0)+1);
        }
        System.out.println(wordsMap);
        int count = 0;
        for(Map.Entry<String, Integer> entry : wordsMap.entrySet()){
            if(entry.getValue() > 1){
                count++;
            }
        }


        return count;
    }
}
