package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class RightPascal {
    /**
     * Psudeo Code
     * 1. Loop through number of rows * 2
     * 2. Find the total col to be printed.
     * 3. loop the col to be printed
     */

    int n =5;
    @Test
    public void rightPascalTriangle() {

        for(int row = 0; row < 2*n; row++) {
            int totalColumnToBePrinted = row > n ? 2*n -row: row;
            for(int col = 0; col < totalColumnToBePrinted; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
