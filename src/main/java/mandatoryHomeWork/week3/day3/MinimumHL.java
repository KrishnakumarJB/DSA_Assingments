package mandatoryHomeWork.week3.day3;

import java.util.Arrays;

public class MinimumHL {
    public int minimumDifference(int[] nums, int k) {

        int left = nums.length-2, right = nums.length -1, high=0,low=0;

        Arrays.sort(nums);

        if(nums.length == 1){
            return 0;
        }



        return nums[right] - nums[left];
        //     int left = 0, right=1, high=0, low=0;

        // while(right < nums.length) {

        // 	if(nums[left] > nums[right]) {
        // 		high = nums[left];
        // 		left++;
        // 	}
        // 	if(nums[left] < nums[right]) {
        // 		low = nums[right];
        // 	}

        // 	right++;
        // }
        //     return high-low;
    }
}
