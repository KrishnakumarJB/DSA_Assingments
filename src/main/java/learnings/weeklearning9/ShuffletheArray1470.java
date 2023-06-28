package learnings.weeklearning9;

import java.util.Arrays;

public class ShuffletheArray1470 {

    //https://leetcode.com/problems/shuffle-the-array/

    /**
     * Psudeo code
     * Approach - Two pointer
     * 1. for lop to iterarte the arrya
     * 2. multi 2*n for new array
     * 3. Iinside the for loop if the array value is % 2 equals to zero
     *      assign the new array value as nums of index divided by 2
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        //[2,3,5,4,1,7]
        int n = 4;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }


    public static int[] shuffle(int[] nums, int n) {

        int[] arr = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            if(i%2 == 0){
                arr[i] = nums[i/2]; // 1st half of the array
            }else{
                arr[i] = nums[n+i/2]; // second half of the array
            }

        }

        return  arr;
    }


    public static int[] shuffle1(int[] nums, int n) {

        int mid = nums.length/2;

        int left = mid, right = mid+1;
        swap(nums, left,right);
        while(left > 0){
//            swap(nums, left, left-1);
            if(left-1 != 0 && right+1 != nums.length){
                swap(nums, left, left-1);
                swap(nums, right, right+1);
            }


            left--;
            right++;

        }
        return nums;

    }

    static int[] swap(int[] arr, int one, int two){

        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
        return arr;
    }

}
