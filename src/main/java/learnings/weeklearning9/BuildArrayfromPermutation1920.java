package learnings.weeklearning9;

import java.util.Arrays;

public class BuildArrayfromPermutation1920 {

    //https://leetcode.com/problems/build-array-from-permutation/solutions/

    /**
     * using time 0(n) and space is 0(n)
     * @param args
     */

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
//        buildArray(nums);
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {

        int[] arr = new int [nums.length];

        for(int i=0; i < nums.length; i++){
            arr[i] = nums[nums[i]];
//            nums[i] = nums[nums[i]];

        }

//        return nums;
        return arr;

    }

    static int swap(int[] arr, int one, int two){

        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;

        return arr[two];
    }
}
