package learnings;

import java.util.Arrays;

public class MoveZeroes {


    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(move(nums)));
    }

    static int[] move(int[] nums){
        int left = 0, right = 0;

        while(right < nums.length){

            if(nums[left] != 0){
                left++;
                right++;
            } else if(nums[right] == 0){
                right++;
            } else{
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
//                left = right;

                //https://www.baeldung.com/java-base64-encode-and-decode
            }

//            if(nums[left] < 1){
//
//            } else if(nums[right] < 1){
//
//            }
//            right++;
        }
        return nums;
    }
}
