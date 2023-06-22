package learnings.weekLearning8;

import org.junit.Test;

public class SlidingWindow {


    @Test
    public void sd(){
//        int [] customers = {1,0,1,2,1,1,7,5};
        int [] customers = {1};
//        int [] grumpy = {0,1,0,1,0,1,0,1};
        int [] grumpy = {0};
        int minutes = 1, sum=0, max=0;

        if (customers[0] != 0) {
            System.out.println(max);
        }

        //find the sum
        for(int i =0; i < customers.length; i++){
                if(grumpy[i] != 1){
                    sum += customers[i];
            }
        }
        System.out.println(sum);
        max = sum;
        for(int j = 0; j < minutes; j++){
            max += customers[j];
        }
        System.out.println(max);
        int right = minutes;

        while(right < customers.length){
            max += customers[right];
            max -= customers[right-1];
            right++;

        }

        System.out.println(max);
    }
}
