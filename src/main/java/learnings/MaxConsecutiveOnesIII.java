package learnings;

import org.junit.Test;

public class MaxConsecutiveOnesIII {


//    int [] nums = {1,1,1,0,0,0,1,1,1,1,0};
    int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
    int k = 3;

    @Test
    public void max(){

        int left = 0, right = 0, ones = 0, inc=0, max=0;

       for (int i = 0; i < nums.length; i++){
            if(nums[i] == 0) {
                inc++;
            }
                while(inc > k){
                    if(nums[right] == 0){
//                        left = right;
                        inc--;
                    }
                    right++;
                }


//                System.out.println(ones+1);



            max = Math.max(max, i-right+1);

//                right++;

        }
        System.out.println(max);
    }
}
