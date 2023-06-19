package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class RemoveAllOccarance {
    /**
     * Pseudo Code
     *
     * 1. Traverse the loop to find the number using the given index.
     * 2. store the num
     * 3. loop the array in which if the arr number not equal to index number
     * 4. print the numbers other than index number
     */

    int[] arr = {1,2,3,4,4,5,3};

    int index = 2;
    int num =0;

    @Test
    public void indexFind() {

        for(int i =0; i < arr.length-1;i++) {
            if(i == index) {
                num = arr[i];
            }
        }

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != num) {
                System.out.print(arr[i]);
            }
        }
    }
}
