package mandatoryHomeWork.week1.day2;

import org.junit.Test;

public class RemoveFirstAndLast {
    int[] arr = {1,2,3,4,5,1};
    int valToRemove = 1;

    /**
     * Pseudo Code
     * 1. loop the given array
     * 2. if the value to remove does not match the arr value element then print the value
     * 3.else remove the value
     */

    @Test
    public void removeElement() {
        for(int i = 0; i <arr.length; i++) {
            if(arr[i] != valToRemove) {
                System.out.print(arr[i]);
            }
        }
    }
}
