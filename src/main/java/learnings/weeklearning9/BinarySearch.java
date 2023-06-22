package learnings.weeklearning9;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {-5,-4,-3,0, 1,4,6,15,20,45,67};
        int target = 0;
        int ans = binarySear(arr, target);
        System.out.println(ans);
    }

    public static int binarySear(int[] arr, int target){

        int left =0, right = arr.length;
        int mid =0;

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

        return -1;


    }
}
