package learnings;

import java.util.Arrays;

public class RearrangeArrayElementsbySign {



    public static void main(String[] args) {
        int [] nums = {-1,3,1,-2,-5,2,-4};
        reArr(nums);
    }

    public static int[] reArr(int[] nums){
        int left = 0, right = 0;

        while(right < nums.length){



            if(nums[right] < 0 ){
                if(nums[left] > 0){
                    swap(nums, left, right);
                    left = right;
                }

            }

            right++;
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void swap(int[] sw, int left, int right){
        int temp = sw[left];
        sw[left] = sw[right];
        sw[right] = temp;
    }

}
