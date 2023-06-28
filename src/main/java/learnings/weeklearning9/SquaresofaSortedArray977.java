package learnings.weeklearning9;

import java.util.Arrays;

public class SquaresofaSortedArray977 {


    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        sq(nums);
    }

    static int[] sq(int[] nums){

        int[] arr = new int[nums.length];


        int left = 0, right = arr.length-1;

        for (int i = 0; i < nums.length; i++) {
            int sq = nums[i]*nums[i];
            arr[i] = sq;


        }
        Arrays.sort(arr);
//        while(left < right){
//
//            if(arr[left] < arr[right]){
//                swap(arr, left, right);
//                left++;
//            }
//
//
//
//
////            System.out.println(sq);
////            if(sq > -nums[right]){
////                swap(nums, right,left);
////                left++;
////            }
//            right++;
//        }

        System.out.println(Arrays.toString(arr));
        return nums;
    }

    static void swap(int[] arr, int one,int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;

    }
}
