package mandatoryHomeWork.week12.day1;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement_169 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,7};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> hmNums = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            hmNums.put(nums[i], hmNums.getOrDefault(nums[i], 0)+1);
        }

        int maxCount = 0, result = 0;

        for(HashMap.Entry<Integer, Integer> number : hmNums.entrySet()){

            if(number.getValue() > maxCount){
               maxCount = number.getValue();
               result = number.getKey();
            }


        }

        return result;
    }
}
