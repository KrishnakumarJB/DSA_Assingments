package learnings;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    private static int[] reverseArray(int[] arr) {

        int left = 2, right = arr.length-1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }
}
