package mandatoryHomeWork.week1.day3;

import org.junit.Test;

public class PowerTwo {
    /**
     * Pseudo code
     * 1. In a while loop condition is number is not equal to 1
     * 2. if the number reminder is not 0 return false
     * else divide the number by 2 till the number is 1
     */
    int n = 16;
    @Test
    public void powerTwo() {
        System.out.println(test());
    }

    public boolean test() {

        if(n == 0) {
            return false;
        }
        while(n != 1) {
            if(n%2 != 0) {
                return false;
            }
            else {
                n=n/2;
            }

        }
        return true;
    }
}
