package mandatoryHomeWork.week9.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MatchingStrings {

    /**
     * brute force -> Space O(1), Time O(n2)
     *
     * Create a for each loop and traverse queries in it -> Solved using two forloops
     * if queries is found in the stringlist add a count
     *  add a count in a new array
     * finally return the count array
     * @param args
     */


    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("ab");
        stringList.add("ab");
        stringList.add("abc");

        List<String> queries = new ArrayList<>();
        queries.add("ab");
        queries.add("abc");
        queries.add("bc");

        List<Integer> newlist = matchingStrings(stringList, queries);
        System.out.println(newlist);

    }


    /**
     * Searched and with hint solved
     * @param stringList
     * @param queries
     * @return
     */
    public static List<Integer> matchingStringsCustom(List<String> stringList, List<String> queries) {
        List<Integer> result = new ArrayList<>();
        for (String str : queries) {
            result.add(Collections.frequency(stringList, str));
        }
        return result;
    }
    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here

        List<Integer> countArray = new ArrayList<>();
//        int j = 0;
        int count = 0;
        for (int i = 0; i < queries.size(); i++) {
            count = 0;
            for (int j = 0; j < stringList.size(); j++) {
                if(queries.get(i).equals(stringList.get(j))){
                    count++;
                }

            }
            countArray.add(count);
        }

        return countArray;
    }
}
