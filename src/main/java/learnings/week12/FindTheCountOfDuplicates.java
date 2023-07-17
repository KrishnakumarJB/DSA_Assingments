package learnings.week12;

import java.util.HashMap;

public class FindTheCountOfDuplicates {


    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
    }

    public void duplicates(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsValue(nums[i])){
                map.put(nums[i], map.getOrDefault(i+1,0 ));
            }

//            if(map.values().contains()){
//
//            }
        }

    }


}
