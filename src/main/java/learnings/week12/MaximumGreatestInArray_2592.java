package learnings.week12;

import java.util.Arrays;

public class MaximumGreatestInArray_2592 {

    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] nums = {1,3,5,2,1,3,1};
        System.out.println(maximizeGreatness(nums));
    }

    public static int maximizeGreatness(int[] nums) {
        int left = 0, right = 0, count = 0;
        Arrays.sort(nums);
        while(right < nums.length){
            if(nums[left] < nums[right]){
                count ++;
                left++;
            }

            right++;
        }


        return count;
    }

}
