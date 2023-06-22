package learnings.weekLearning8;

import java.util.Arrays;

public class MaxMinDiff {


    public static void main(String[] args) {
       int[]  nums = {87063,61094,44530,21297,95857,93551,9918};
       int k = 6;

      System.out.println( maxMin(nums, k));

    }

    static int maxMin(int[]nums, int k){
        int left = nums.length-2, right = nums.length -1, high=0,low=0;

        Arrays.sort(nums);
        if(nums.length == 1){
            return 0;
        }
        while(right < nums.length) {

             	if(nums[left] > nums[right]) {
             		high = nums[left];
             		left++;
             	}
             	if(nums[left] < nums[right]) {
             		low = nums[right];
             	}

             	right++;
             }
                 return high-low;

//        return num[right] - num[left];
    }

}
