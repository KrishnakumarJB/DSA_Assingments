package mandatoryHomeWork.week1.day1;

import org.junit.Test;

public class PyramidProgram {

    int n = 5;

    /**
     * 1. use rows and columns
     * 2. for loop for n number of outer loop
     * 3. find the spaces to be given using n - row
     * 4. write a loop to give spaces
     * 5. print the * using a col with no of rows
     * 6. println to go next line
     */
    @Test
    public void pyramid() {
        for(int row = 0; row <= n; row++) {
            int noOfSpaces = n- row;
            for(int space = 0; space <=noOfSpaces; space++) {
                System.out.print(" ");
            }
            for(int col =1; col<=row;col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
