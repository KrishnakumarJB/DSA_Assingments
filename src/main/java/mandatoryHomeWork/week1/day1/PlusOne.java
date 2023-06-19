package mandatoryHomeWork.week1.day1;

import org.junit.Test;

import java.util.Arrays;

public class PlusOne {
    //	int[] arr = {9,9,9,9,9};
    int[] arr = {1,2,3,4,5};

    /**
     * Psudeo code
     * 1.Find the length of the array
     * 2.reverse the loop
     * 3. if arr element value is lesser than 9 increase the last value
     * 4. if arr element value is greater create a new array with one length + one
     * 5. Add one to the index 0 index
     *
     */

    @Test
    public void plusOne() {

        int len = arr.length;
        System.out.println(len);
        for(int i = len-1; i >= 0; i-- ) {
            if(arr[i]<9) {
                arr[i]++;
                System.out.println(Arrays.toString(arr));
                break;
            }
            arr[i] = 0;

        }
        int[] newArr = new int[len+1];
        newArr[0]=1;
        System.out.println(Arrays.toString(newArr));
    }
}
