package learnings.weeklearning9;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2,4,6,15,20,45,67};
        int target = 3;
        int ans = binarySear(arr, target);
        System.out.println(ans);
    }

    public static int binarySear(int[] arr, int target){

        int left =0, right = arr.length-1;
        int mid =0;

        if(target > arr[arr.length-1]){
            return -1;
        }
        while(left <= right){
            /**
             * mid = left + (right-left)/2;
             *
             * This formula we are using because of interger cannot hold large numbers
             * So we are cutting it down
             */
            mid = left + (right-left)/2;

            if(arr[mid] < target){
                left = mid+1;
            } else if (arr[mid] > target){
                right = mid-1;
            } else {
                return mid;
            }
        }

        return right;


    }
}
