package learnings.weeklearning9;

import java.util.Arrays;

public class SetColors75 {


    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        int left =0, right = nums.length;

        while(left < right){
            if(nums[left] < nums[right]){
                left++;
            }
            else if(nums[right] < nums[left]){
                swap(nums[left], nums[right]);
                right--;
            } else if(nums[right] == nums[left]){
                left++;
                right--;
            }

        }
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int l, int r){
        int temp = l;
        l = r;
        r = temp;
    }
}
