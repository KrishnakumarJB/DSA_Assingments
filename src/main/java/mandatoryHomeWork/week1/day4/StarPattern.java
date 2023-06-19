package mandatoryHomeWork.week1.day4;

import org.junit.Test;

public class StarPattern {
    /**
     * Pseudo Code
     *
     * 1. Loop the row with 2*n
     * 2. Find the column total to be printed
     * 3. number of spaces to be given in row
     * 4. number of time s * to be printed
     * 5. print the next line outside the loop
     */


    int n =5;


    @Test
    public void Sanda() {
        for(int row =0; row<=2*n; row++) {
            int totalCol = row>n ? 2*n-row: row;
            int space = n - totalCol;

            for(int s =0; s<totalCol; s++) {
                System.out.print(" ");
            }
            for(int col =0; col<space; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
