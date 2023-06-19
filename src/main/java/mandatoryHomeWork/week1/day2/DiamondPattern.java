package mandatoryHomeWork.week1.day2;

import org.junit.Test;

public class DiamondPattern {
    @Test
    public void diamondPattern() {
        int n = 5;

        for(int row =0; row <2*n ; row++) {

            int colToPrint = row > n ? 2*n -row : row;
            int space = n -colToPrint;
            for(int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            for(int col = 0 ; col<colToPrint; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
