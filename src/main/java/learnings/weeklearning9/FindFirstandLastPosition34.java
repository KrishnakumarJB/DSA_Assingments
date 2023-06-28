package learnings.weeklearning9;

import java.util.Arrays;

public class FindFirstandLastPosition34 {

    /**
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     * @param args
     */


    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
        System.out.println(Arrays.toString(searchRangeTwoPointer(nums, target)));
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {


        int left = 0, right = nums.length-1, mid = 0;
        int[] arr = new int[2];
        while(left < right){
            mid = left + (right-left)/2;
            System.out.println(mid);
            if(target > nums[mid]){
                left = mid+1;
            } else {
                right = mid -1;
            }


        }
        System.out.println(left);
        arr[0] = left;
        arr[1] = right;




        return arr;
    }


    //two pointer
    public static int[] searchRangeTwoPointer(int[] nums, int target) {

        int left = 0, right = nums.length-1;
        int[] arr = new int[2];
        while(left < right){
            if(nums[left] == target && nums[right] == target){
                arr[0] = left;
                arr[1] = right;
                break;
            }
            if(nums[left] != target){
               left++;
            }
            if(nums[right] != target){
                right--;
            }


        }
        System.out.println(left +" "+ right);

    return arr;



    }
}

