package learnings.week13;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindTheMaxRepeatingSmallIndex {
    /**
     * Given an array arr[] of size n, find the index of first repeating element that repeats the maximum number of times. The index of its first occurrence should be the smallest.
     * Note:- The position you return should be according to 1-based indexing.
     * Input:     arr[] = {1, 5, 3, 4, 3, 5, 6, 3, 4, 4}
     * Output:   3
     */

    public static void main(String[] args) {

        int arr[] = {3 ,1, 5, 3, 4, 3, 5, 6, 3, 4, 4};
       LinkedHashMap<Integer, Integer> llhm = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            llhm.put(arr[i], llhm.getOrDefault(arr[i],0)+1);
        }
        System.out.println(llhm);
        int maxValueInMap = 0;
        for (HashMap.Entry<Integer, Integer> entry : llhm.entrySet()) {  // Iterate through HashMap
            if (entry.getValue() > maxValueInMap) {
                maxValueInMap = entry.getKey();

                System.out.println(entry.getKey());     // Print the key with max value
            }

        }
        System.out.println(maxValueInMap);
        for (int i = 0; i < arr.length; i++) {
            if(maxValueInMap == i){
                System.out.println(" new "+ (i+1));
                return;
            }
        }




        System.out.println("Max value"+maxValueInMap);

    }


}
