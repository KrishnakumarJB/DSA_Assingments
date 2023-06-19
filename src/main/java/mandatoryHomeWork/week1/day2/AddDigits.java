package mandatoryHomeWork.week1.day2;

import org.junit.Test;

public class AddDigits {
    /**
     * Psuedo Code
     *  1. Decalre varibale sum
     *  2. if number equal to zer return 0
     *  3. if number modlus of nine equal to 0 return 9
     *  4. finally sum equal to number modlous of 9 return the
     */

    @Test
    public void addDigit() {
        int n = 456;
        int sum;
        if(n == 0) {
            sum =0;
        }
        if(n%9 ==0) {
            sum =9;
        }
        sum = n%9;
        System.out.println(sum);
    }
}
